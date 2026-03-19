package ru.otus.java.basic.homeworks.homework20;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println(serverSocket.getInetAddress());
            System.out.println("Server started");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                DataInputStream is = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());

                String request = is.readUTF();
                System.out.println("Server received: " + request);
                float result = Calculator.calculateFromString(request);
                os.writeUTF(result+"");
                os.flush();
                System.out.println("Server response: " + result);

            }
        } catch (IOException ioe) {
            System.out.println("Сервер закрыл соединение");
        }

    }

    private static String transformToUpperCase(String request) {
        return request.toUpperCase();
    }

}
