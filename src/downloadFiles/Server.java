package downloadFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        
        Integer PORT =  Integer.parseInt(args[0]);
        String HOST =  args[1];
        ServerSocket ss = new ServerSocket(PORT);

        try {
            // When the server accepts a new connection
            Socket clientSocket = ss.accept();

            // To obtain data from the client
            InputStream in = clientSocket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // To write data out to the clientSocket
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream());

            // To read line by line from the client 
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                out.println(line);
            }

            


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
