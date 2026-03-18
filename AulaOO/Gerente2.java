package AulaOO;

public class Gerente2 extends Funcionario2 {
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
		return super.getBonus() + 5000;
	}
}
