package AulaOO;

public class TestaContaCliente {
	public static void main(String[] args) {
		ContaCliente cc1 = new ContaCliente();
		Cliente cliente2 = new Cliente();
		cc1.cliente = cliente2;
		cc1.cliente.nome = "Jarbas";
		
		System.out.println("O nome do cliente da conta cc1 é "+cc1.cliente.nome);
		
		}
}
