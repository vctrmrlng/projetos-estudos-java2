package AulaOO;

public class Atendente3 extends FuncionarioAbstract3Especial{
	int senha;
	
	public boolean verificaSenha (int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;			
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	public void atenderCliente () {
		
	}
	@Override
	public double getBonus() {
		return this.salario * 0.17;
	}

}
