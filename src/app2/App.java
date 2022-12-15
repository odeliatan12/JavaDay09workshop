package app2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws IOException {
        

        // Open a server socket to connect to client
        Integer PORT =  8080;
        ServerSocket ss = new ServerSocket(PORT);
        Socket socket = ss.accept();
        

        // I want to open a new thread and have 2 new thread
        ExecutorService executor = Executors.newFixedThreadPool(2);

        

    }
}
