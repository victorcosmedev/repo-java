package banco;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConnectionFactoryTest {

    @Test
    void conectarNoBanco() {
        Connection conexao = new ConnectionFactory().getConnection();

        try {
            // a conexão está fechada? se sim, retorne true, se não, retorne false
            assertFalse(conexao.isClosed());
            conexao.close();

            assertTrue(conexao.isClosed());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            if (!conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
