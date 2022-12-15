package chatServer;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatMain {
    
    public static void main(String[] args) throws Exception{

        // getting the port number 
        Integer PORT = Integer.parseInt(args[0]);
        // Connect to the server
        ServerSocket server = new ServerSocket(PORT);

        // Accepting incoming datastreams from client 
        while(true){
            System.out.println("Accepting incoming datastreams...");
            Socket client = server.accept();

            System.out.println("New client connected" + client.getInetAddress());
            Thread thread = new Thread(new ChatClient("localhost", PORT));
            thread.start();

        }

    }
}
