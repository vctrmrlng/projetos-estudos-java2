package biliotecas;

public class TestaString {
	public static void main(String[] args) {
		String a = new String("Venha aprender Java no Senac");
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[4]);
		
		String c = "venha aprender java no senac";
		String cc = "";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = c.compareTo(a);
		System.out.println(j);
		int k = c.compareToIgnoreCase(a);
		System.out.println(k);
		
		char dc = a.charAt(4); //qual letra está no indice
		System.out.println(dc);
		int m = a.length(); //comprimeto da string
		System.out.println(m);
		String n = c.substring(15); //cria uma nova string a partir do indice
		System.out.println(n);
		String p = c.trim(); // remove espaços do inicio
		System.out.println("p = "+p);
		int q = c.indexOf("a");
		System.out.println("q = "+q);
		int r = c.lastIndexOf("a");
		System.out.println("r = "+r);
		boolean s = a.isEmpty();
		System.out.println("s = "+s);
		boolean t = cc.isEmpty();
		System.out.println("t = "+t);
		
		boolean v = a.contains("Java"); //case sensitive
		System.out.println(v);
	
		//testar o metodo a.replace(("a", "o")
}
}
