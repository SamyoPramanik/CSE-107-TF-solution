
import util.SocketWrapper;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Server {

    private ServerSocket serverSocket;
    public HashMap<String, SocketWrapper> clientMap;
    public HashMap<String,ArrayList<Group>>groups;

    Server() {
        clientMap = new HashMap<>();
        groups = new HashMap<>();
        try {
            serverSocket = new ServerSocket(33333);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                serve(clientSocket);
            }
        } catch (Exception e) {
            System.out.println("Server starts:" + e);
        }
    }

    public void serve(Socket clientSocket) throws IOException, ClassNotFoundException {
        SocketWrapper socketWrapper = new SocketWrapper(clientSocket);
        String clientName = (String) socketWrapper.read();
        clientMap.put(clientName, socketWrapper);
        groups.put(clientName, new ArrayList<Group>());
        new ReadThreadServer(clientMap, socketWrapper,groups);
    }

    public static void main(String args[]) {
        new Server();
    }
}
