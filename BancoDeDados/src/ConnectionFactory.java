import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String urlDeConexao;
    private String login;
    private String senha;

    ConnectionFactory(){
        this.urlDeConexao = "jdbc:h2:./banco/bancoDeDados";
        this.login = "sa";
        this.senha = "";
    }

    public Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(urlDeConexao, login, senha);
    }
}
