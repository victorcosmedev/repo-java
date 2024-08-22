package banco.fiap.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTest {

    @Test
    void igualdade(){
        ContaCorrente umaConta = new ContaCorrente("1111", 100);
        ContaCorrente outraConta = new ContaCorrente("1111", 100);

        // Quando chamamos o método assertEquals, o JUnit consulta do método .equals() na classe ContaCorrente
        assertEquals(umaConta, outraConta);
    }
}
