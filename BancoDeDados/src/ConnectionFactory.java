import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection obterConexao(){
        String urlDeConexao = "jdbc:h2:./banco/bancoDeDados";
        String login = "sa";
        String senha = "";

        try {
            Connection connection = DriverManager.getConnection(urlDeConexao, login, senha);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e); // RuntimeException não precisa obrigatoriamente ser tratada
            // Caso fosse throw new SQLException, precisaria de um Throws na assinatura do método e a exceção seria jogada para a 'TesteDeConexao'
        }

    }

    public void fechar(Connection conexao){
        try{
            conexao.close();
        } catch (SQLException e){
            throw new RuntimeException("Falha no fechamento da conexão com o banco", e);
        }
    }
}
