import dominio.Funcionario;
import dominio.FuncionarioDAO;

import java.time.LocalDate;

public class SistemaDeFuncionarios {
    Funcionario neymar = new Funcionario("Neymar Jr.", "0001", LocalDate.of(1991, 10, 10));

    FuncionarioDAO funcionarioDao = new FuncionarioDAO();
    funcionarioDao.adiciona(neymar);
}
