package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Waiting for client...");

            while (true) {
                try (Socket socket = serverSocket.accept();
                     InputStreamReader in = new InputStreamReader(socket.getInputStream());
                     BufferedReader bufferedReader = new BufferedReader(in);
                     PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true)) {

                    System.out.println("Client connected");

                    // Read message from client
                    String clientMessage = bufferedReader.readLine();
                    System.out.println("Client: " + clientMessage);

                    // Send response to client
                    printWriter.println("Connection established");

                } catch (IOException e) {
                    System.out.println("Error occurred while handling client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}
