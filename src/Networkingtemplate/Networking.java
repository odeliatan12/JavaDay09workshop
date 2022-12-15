package Networkingtemplate;

import java.io.*;
import java.net.*;

public class Networking {
    public static void main(String[] args) {
        // Check if the program is being run in server or client mode
        if (args.length == 0) {
            // Start the server
            startServer();
        } else {
            // Start the client
            startClient(args[0]);
        }
    }

    private static void startServer() {
        try {
            // Create a server socket and start listening on port 8000
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started, waiting for clients to connect...");

            // Accept a new client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("New client connected: " + clientSocket.getInetAddress());

            // Create input and output streams to read and write data to the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Continuously read data from the client and print it to the console
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Received from client: " + line);
            }

            // Close the client socket
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startClient(String serverAddress) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket(serverAddress, 8000);
            System.out.println("Connected to server: " + socket.getInetAddress());

            // Create input and output streams to read and write data to the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Continuously read data from the user and write it to the server
            BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = userIn.readLine()) != null) {
                out.println(line);
            }

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

