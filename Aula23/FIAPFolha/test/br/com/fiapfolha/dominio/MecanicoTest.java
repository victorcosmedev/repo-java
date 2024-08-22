package br.com.fiapfolha.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MecanicoTest {
    @Test
    void testarSalario(){
        Mecanico mecanico = new Mecanico(7500, "3366", LocalDate.of(1990, 10,5),250);
        double salario = mecanico.lerSalario();

        Assertions.assertEquals(7750, salario);
    }
}
