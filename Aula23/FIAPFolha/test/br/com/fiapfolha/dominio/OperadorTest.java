package br.com.fiapfolha.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class OperadorTest {
    @Test
    void testarSalario(){
        Operador operador = new Operador(500, "3434", LocalDate.of(12, 4, 2016));

        double salario = operador.lerSalario();

        Assertions.assertEquals(510, salario);
    }
}
