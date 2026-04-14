package biliotecas;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class LeArquivo {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("escrita.txt");

		OutputStreamWriter osr = new OutputStreamWriter(os);
		
		BufferedWriter bufw = new BufferedWriter(osr);
		
		bufw.write("Aprendendo Java no Senac");
		bufw.close();
		
		System.out.println("Sucesso");
		
		

	}

}
