package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        try {

            // IP do computador servidor
            String ipServidor = "10.136.71.12";

            // Porta usada no servidor
            int porta = 5000;

            Socket socket = new Socket(ipServidor, porta);

            System.out.println("Conectado ao servidor!");

            DataInputStream entrada =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream saida =
                    new DataOutputStream(socket.getOutputStream());

            Scanner teclado = new Scanner(System.in);

            // Thread para receber mensagens
            Thread receberMensagem = new Thread(() -> {

                try {

                    while (true) {

                        String msg = entrada.readUTF();

                        System.out.println("\nServidor: " + msg);
                    }

                } catch (IOException e) {

                    System.out.println("Servidor desconectado.");
                }

            });

            receberMensagem.start();

            // Enviar mensagens
            while (true) {

                System.out.print("Você: ");

                String msgEnviar = teclado.nextLine();

                saida.writeUTF(msgEnviar);

            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}