package ru.otus.java.basic.homeworks.homework20;



import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8080 )) {
                Client client = new Client( socket.getInputStream(), socket.getOutputStream());

                System.out.println("Введите операцию с клавиатуры в формате [NUMBER][OPERATOR][NUMBER] (например 5*2): ");
                String message = scanner.nextLine();
                client.send(message);


            }catch (IOException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }
}
