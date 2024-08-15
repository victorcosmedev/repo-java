import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaDeFuncionarios {
    public static void main(String[] args) {
        Funcionario neymar = new Funcionario("Neymar", "0001", LocalDate.of(1991, 10, 10));
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        // funcionarioDao.adiciona(neymar);
        ArrayList<Funcionario> funcionarios = funcionarioDao.listarTodos();

        for(Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Crachá: " + funcionario.getCracha());
            System.out.println("Data de Nascimento" + funcionario.getDataNascimento());
        }

        funcionarioDao.fechar();
    }
}

