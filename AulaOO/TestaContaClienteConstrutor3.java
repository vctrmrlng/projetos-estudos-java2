package AulaOO;

public class TestaContaClienteConstrutor3 {
	public static void main(String[] args) {
		ContaClienteConstrutor3 cc31 = new ContaClienteConstrutor3("Genivaldo","123456789-00");
		System.out.println("O nome do cliente da conta cc2 é "+cc31.cliente.nome);		
		System.out.println("O CPF do titular da conta cc2 é " +cc31.cliente.cpf);
		int contador = ContaClienteConstrutor3.getContadorContas();
		System.out.println("Quantidade de clientes na base: " +contador);
		System.out.println("==============================================================");
		ContaClienteConstrutor3 cc32 = new ContaClienteConstrutor3 ("Thiago","112.334.556-78");
		System.out.println("O titular da conta cc32 é o " +cc32.cliente.nome);
		System.out.println("O CPF do titular da conta é " +cc32.cliente.cpf);
		contador = ContaClienteConstrutor3.getContadorContas();
		System.out.println("Quantidade de clientes na base:" +contador);
}
}
