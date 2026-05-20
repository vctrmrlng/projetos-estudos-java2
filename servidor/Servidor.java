package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

    public static void main(String[] args) {

        try {

            // Porta do servidor
            ServerSocket servidor = new ServerSocket(5000);

            System.out.println("Servidor iniciado...");
            System.out.println("Aguardando conexão...");

            // Aguarda cliente conectar
            Socket socket = servidor.accept();

            System.out.println("Cliente conectado!");

            // Entrada e saída de dados
            DataInputStream entrada =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream saida =
                    new DataOutputStream(socket.getOutputStream());

            Scanner teclado = new Scanner(System.in);

            // Thread para RECEBER mensagens
            Thread receberMensagem = new Thread(() -> {

                try {

                    while (true) {

                        String msg = entrada.readUTF();

                        System.out.println("\nCliente: " + msg);
                    }

                } catch (IOException e) {

                    System.out.println("Cliente desconectado.");
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