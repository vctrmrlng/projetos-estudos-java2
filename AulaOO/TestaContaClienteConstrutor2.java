package AulaOO;

public class TestaContaClienteConstrutor2 {
	public static void main(String[] args) {
		ContaClienteConstrutor2 cc2 = new ContaClienteConstrutor2("Genivaldo","123456789-00");
		//cc2.cliente.nome = "Lucas Alves";
		System.out.println("O nome do cliente da conta cc2 é "+cc2.cliente.nome);		
		System.out.println("O CPF do titular da conta cc2 é " +cc2.cliente.cpf);
}
}
