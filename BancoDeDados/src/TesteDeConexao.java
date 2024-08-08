import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {
    public static void main(String[] args) {
        String urlDeConexao = "jdbc:h2:./banco/bancoDeDados";
        String login = "sa";
        String senha = "";

        try{
            Connection conexao = new ConnectionFactory().obterConexao();
            System.out.println("Conectado!");
            conexao.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
