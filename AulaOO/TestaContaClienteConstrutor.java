package AulaOO;

public class TestaContaClienteConstrutor {
	public static void main(String[] args) {
		ContaClienteConstrutor cc = new ContaClienteConstrutor();
		cc.cliente.nome = "Lucas Alves";
		
		System.out.println("O nome do cliente da conta cc2 é "+cc.cliente.nome);
		
		}
}
