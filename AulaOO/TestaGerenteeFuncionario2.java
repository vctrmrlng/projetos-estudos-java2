package AulaOO;

public class TestaGerenteeFuncionario2 {
	public static void main(String[] args) {
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(3000);
		double salFuncionario = f2.getSalario();
		System.out.println("Salário do Funcionario: " +salFuncionario);
		System.out.println("Bônus do Funcionário: "+f2.getBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(20000);
		double salGerente = g1.getSalario();
		System.out.println("Salário do gerente: " +salGerente);
		System.out.println("Bônus do gerente: " +g1.getBonus());
	
	}
}
