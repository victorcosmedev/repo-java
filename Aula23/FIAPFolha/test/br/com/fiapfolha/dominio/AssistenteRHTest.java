package br.com.fiapfolha.dominio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class AssistenteRHTest {
    @Test
    void testeCalculoSalarioDezPorCento(){
        AssistenteRH assistente = new AssistenteRH(100, "4444", LocalDate.of(1980, 10, 10), 10);
        double salario = assistente.lerSalario();

        Assertions.assertEquals(110, salario);
    }

    @Test
    void testeCalculoSalarioSemComissao(){
        AssistenteRH assistente = new AssistenteRH(100, "4444", LocalDate.of(1980, 10, 10), 0);

        double salario = assistente.lerSalario();
        Assertions.assertEquals(100, salario);
    }
}
