package connection;

import java.net.Socket;

public class HttpClientConnection implements Runnable{

    private Socket socket;

    // Creating the constructor
    public HttpClientConnection(Socket socket) {
        this.socket = socket;
    }

    @Override
    // To get what each thread is doing
    public void run() {
        
    }
}