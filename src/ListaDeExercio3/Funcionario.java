package ListaDeExercio3;

public class Funcionario {
	private double salario;
	private String nome;
	
	public Funcionario (double salario, String nome) {
		this.salario = salario;
		this.nome = nome;
	}
	
	// Métodos getthers e setters dos funcionarios.
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
