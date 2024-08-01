package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040);
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
             InputStreamReader in = new InputStreamReader(socket.getInputStream());
             BufferedReader bufferedReader = new BufferedReader(in)) {

            System.out.println("Connected to the server");

            // Send message to server
            printWriter.println("Want to connect");

            // Read response from server
            String serverResponse = bufferedReader.readLine();
            System.out.println("Server: " + serverResponse);

        } catch (IOException e) {
            System.out.println("Client exception: " + e.getMessage());
        }
    }
}
