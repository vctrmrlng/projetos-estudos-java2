package estrutrascontrole;

public class Decisao2 {

	public static void main(String[] args) {
		String conceito;
		int nota = 92;
		if (nota >= 90) {
			conceito="Excelente";
		} else if (nota >=75) { 
				conceito="Muito bom";
		} else if (nota >=60) {
			conceito="Bom"; 
		} else {
			conceito="Reprovado";
		 	}
		System.out.println(conceito);
		}
	}
