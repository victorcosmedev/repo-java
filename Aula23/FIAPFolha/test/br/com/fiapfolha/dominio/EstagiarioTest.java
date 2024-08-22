package br.com.fiapfolha.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EstagiarioTest {
    @Test
    void testarSalario(){
        Estagiario estagiario = new Estagiario(800, "4456", LocalDate.of(2005, 3, 8), 350);

        double salario = estagiario.lerSalario();
        Assertions.assertEquals(1150, salario);
    }
}
