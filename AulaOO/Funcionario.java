package AulaOO;

public class Funcionario {
	String nome;
	String cpf;
	String departamento;
	String dataAdmissao;
	double salario;
	String status;
	
	void bonificacao (double bonus) {
		this.salario = this.salario + bonus;
	}
}
