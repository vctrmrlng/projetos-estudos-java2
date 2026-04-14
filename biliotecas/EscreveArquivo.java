package biliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EscreveArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("teste.txt");
		//InputStream is = System.in;
		//InputStream é a classe quesabe capturar um byte
		//recebendo-o da entrada padrão do sistema
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader sabe receber um byte e transformá-lo
		
		BufferedReader bufr = new BufferedReader(isr);
		//BufferedReader sabe armazenar varios char e armazenar num bufffer, depois transforma em string
		
//		char c;
//		c = (char) isr.read();
		
		String s;
		s = bufr.readLine();
		
		System.out.println(s+"\n");
		
		while (s != null) {
			System.out.println(s);
			s = bufr.readLine();
		}

	}

}
