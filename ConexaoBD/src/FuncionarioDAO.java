import java.sql.*;
import java.util.ArrayList;

public class FuncionarioDAO {
    private Connection conexao;
    public FuncionarioDAO() {
        conexao = new ConnectionFactory().getConnection();
    }
    public void adiciona(Funcionario funcionario) {
        try {
            String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, funcionario.getNome());
            comandoDeInsercao.setString(2, funcionario.getCracha());
            comandoDeInsercao.setDate(3, Date.valueOf(funcionario.getDataNascimento()));
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void fechar(){
        try {
            conexao.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Funcionario> listarTodos(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try{
            String sqlSelect = "SELECT * FROM FUNCIONARIOS";
            PreparedStatement comandoDeSelecao = conexao.prepareStatement(sqlSelect);
            ResultSet rs = comandoDeSelecao.executeQuery();

            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("nome"));
                funcionario.setNome(rs.getString("cracha"));
                funcionario.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());

                funcionarios.add(funcionario);
            }

        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        return funcionarios;
    }
}