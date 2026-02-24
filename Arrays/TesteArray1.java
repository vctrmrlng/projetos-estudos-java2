package Arrays;

public class TesteArray1 {
	public static void main(String[] args) {
		//declaração do array
		int notas[]; //tb pode ser int[] notas;
		
		//contrução do array
		notas = new int[100];
		
		// ou declaração e contrução na mesma linha
		int notas2[] = new int[100];
		
		// ou você pode contruir e inicializar na mesma linha
		int notas3[] = {5,6,7,8,9};
		
		boolean resultados [] = {true, false, true, false};
		
		String diasDaSemana[] = {"seg","ter","qua","qui","sex","sab","dom"};
		System.out.println("A terceira nota foi: "+notas3[2]);
		
	}

}
