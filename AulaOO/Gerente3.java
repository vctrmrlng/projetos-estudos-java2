package AulaOO;

public class Gerente3 extends FuncionarioAbstract3 implements AcessoInterno{
	private int senha;
	
	public boolean verificaSenha (int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;			
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	
	
	@Override
	public double getBonus() {
		return this.salario *0.17;
	}
}
