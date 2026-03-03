package AulaOO;

public class Conta {
	int agencia;
	int numero;
	String nome;
	double saldo;
	double limite;
	
	void sacar(double valor) {
		double saldoAlterado = saldo - valor;
		saldo = saldoAlterado;
		// ou em uma linha só saldo = saldo - valor
		// ou ainda saldo -= valor
	}
	
	void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}
}
