package AulaOO;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1; //declaração
		c1 = new Conta(); //instanciação
		
		Conta c2 = new Conta(); //declaração e instancicação
		
		c1.limite = 10000.00;
		c1.agencia = 010;
		c1.nome = "Clayton";
		c1.numero = 001;
		c1.saldo = 2000.00;
		
		System.out.println("=================================");
		System.out.println("Número da conta: " + c1.numero);
		System.out.println("Titula: " + c1.nome);
		System.out.println("Saldo atual: " + c1.saldo);
		System.out.println("Limite: " +c1.limite);
		
		c1.sacar(20);
		System.out.println("Saldo Atual: " +c1.saldo);
		
		c1.depositar(100);
		System.out.println("Saldo Atual: " +c1.saldo);
	}

}
