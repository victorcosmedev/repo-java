import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteDeConexao {

    //INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?);
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection conexao = connectionFactory.obterConexao();
        System.out.println("Conectado!");

        String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?);";


        try{
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, "Victor Cosme");
            comandoDeInsercao.setString(2, "55885");
            comandoDeInsercao.execute();
        } catch(SQLException e){

        }

        connectionFactory.fechar(conexao);
        System.out.println("Desconectado!");

    }
}
