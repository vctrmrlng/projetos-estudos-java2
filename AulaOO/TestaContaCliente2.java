package AulaOO;

public class TestaContaCliente2 {
	public static void main(String[] args) {
		ContaCliente2 cc2 = new ContaCliente2();
		cc2.cliente.nome = "Lucas Alves";
		
		System.out.println("O nome do cliente da conta cc2 é "+cc2.cliente.nome);
		
		}
}
