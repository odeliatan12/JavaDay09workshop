package connection;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer PORT = Integer.parseInt(args[0]);

        // Number of threads to use including main thread
        ExecutorService thrpool = Executors.newFixedThreadPool(2);

        // Instantiate ServerSocket
        ServerSocket ss = new ServerSocket(PORT);

        while(true){
            // To know whether it is running
            System.out.println("Waiting for connections...");
            Socket socket = ss.accept();

            // Create a HandleClient to handle the client socket
            HttpClientConnection client = new HttpClientConnection(socket);
            // Do not do this. THIS IS NOT A THREAD
            // client.run();
            
            // Submit the Runnable to the threadpool
            thrpool.submit(client);
        }
        
        
    }
}
