package javaNetwork;

import java.net.Socket;
import java.io.IOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("127.0.0.1", 10001);
			
			Scanner s = new Scanner(System.in);
			PrintStream out = new PrintStream(client.getOutputStream());
			
			System.out.println();
			
			while (s.hasNextLine()) {
				out.println(s.nextLine());
			}
				
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


