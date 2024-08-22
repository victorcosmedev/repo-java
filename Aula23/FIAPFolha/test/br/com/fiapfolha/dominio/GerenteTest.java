package br.com.fiapfolha.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GerenteTest {
    @Test
    void testarSalario(){
        Gerente gerente = new Gerente(15000, "5555", LocalDate.of(1990, 10, 10), 500);

        double salario = gerente.lerSalario();
        Assertions.assertEquals(15500, salario);
    }
}
