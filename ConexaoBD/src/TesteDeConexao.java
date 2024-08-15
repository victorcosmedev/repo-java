import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;


public class TesteDeConexao {

	public static void main(String[] args) throws SQLException {	
		Connection conexao = new ConnectionFactory().getConnection();
		// System.out.println("Conectado!");
	
		String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
		PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
		
		comandoDeInsercao.setString(1, "Rogerio Oliveira");
		comandoDeInsercao.setString(2, "67890");
		comandoDeInsercao.setDate(3, toJavaSqlDate(LocalDate.of(2001, 11, 11)));

		comandoDeInsercao.execute();
		comandoDeInsercao.close();

	}
	
	private static Date toJavaSqlDate(LocalDate data) {
		return Date.valueOf(data);
	}

	/*
			Esta é uma classe Java Beans, ela é uma classe com
			Construtor sem argumentos e
			Métodos getters e setters para todos os atributos
		*/
	public static class Funcionario {
		private String nome;
		private String cracha;
		private LocalDate dataNascimento;

		public Funcionario(String nome, String cracha, LocalDate dataNascimento){
			this.nome = nome;
			this.cracha = cracha;
			this.dataNascimento = dataNascimento;
		}

		public Funcionario(){

		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCracha() {
			return cracha;
		}

		public void setCracha(String cracha) {
			this.cracha = cracha;
		}

		public LocalDate getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
	}
}
