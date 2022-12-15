package chatServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatClient extends Thread {

    
    // Connecting to the server using localhost and port
    private Socket clientSocket;

    public ChatClient(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    // To input datastreams from the client using hashmap so to input the key and value 
    Map<String, Socket> clientInput = new HashMap<String, Socket>();


    @Override
    public void run() {
        
        System.out.println("Chat Client is running");

            try{

                Scanner sc = new Scanner("Enter chat message: ");
                String message = sc.nextLine();
                // Create new streams to read into the socket stream
                InputStream cs = clientSocket.getInputStream();
                InputStreamReader inputStream = new InputStreamReader(cs);
                // Use a reader to read the input stream
                BufferedReader in = new BufferedReader(inputStream);
                PrintWriter w = new PrintWriter(clientSocket.getOutputStream());

                System.out.println("Enter username: ");
                String username = in.readLine();

                // Input the map with the username and client socket
                clientInput.put(username, clientSocket);

                // Continuously reading the chat message from client
                while(true){

                    // Read the chat message
                    String line = in.readLine();

                    // If line is empty
                    if(line == null){
                        break;
                    }

                    // split the chat message to get the client username and the message
                    String[] token = line.split(" ");
                    String client = token[0];
                    String messagesString = token[1];

                    // Get the recipients socket from the map
                    Socket clientSocket = clientInput.get(client);

                    // Create an output stream to the serverSocket
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream());

                    // Send the message to the server
                    out.println("From: " + username + ", Message: " + messagesString);

                    // Close the output stream
                    out.close();

 
                }

                // Close the client socket
                clientSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                clientInput.remove(clientSocket);
            }
        }
        
}
