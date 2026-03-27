package aulaException;

public class TesteException {
	public static void main(String[] args) {
		System.out.println("Início do método main");
		metodo1();
		System.out.println("Fim do método main");
	
}

	private static void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}

	private static void metodo2() {
		System.out.println("Inicio do método 2");
		int array[] = new int[10];
		try {
			for (int i=0; i < 20; i++) {
				array[i]=i;
				System.out.println(i);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception pega (caught): " +e);
			
		}
				
		System.out.println("Fim do método 2");
	}
}
