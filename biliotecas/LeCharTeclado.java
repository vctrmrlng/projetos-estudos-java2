package biliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		//InputStream é a classe quesabe capturar um byte
		//recebendo-o da entrada padrão do sistema
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader sabe receber um byte e transformá-lo
		
		char c;
		c = (char) isr.read();
		
		System.out.println("Voce digitou a tecla "+c);

	}

}
