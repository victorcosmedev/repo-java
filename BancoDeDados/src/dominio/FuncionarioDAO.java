package dominio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class FuncionarioDAO {
    private Connection conexao;
    public void adiciona(Funcionario funcionario){
        try{
            String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);

            comandoDeInsercao.setString(1, funcionario.getNome());
            comandoDeInsercao.setString(2, funcionario.getCracha());
            comandoDeInsercao.setDate(3, Date.valueOf(funcionario.getDataNascimento()));

            comandoDeInsercao.execute();
            comandoDeInsercao.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
