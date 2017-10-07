/**
 * Created by reyma on 27/02/2017.
 */
import java.io.*;
import java.net.*;

public class ChatClient {
    private String hostName;
    private int portNumber;
    private Socket clientSocket;

    public ChatClient(String hostName,int portNumber) {
        this.hostName = hostName;
        this.portNumber = portNumber;
        try {
            clientSocket = new Socket(hostName,portNumber);
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch(IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + hostName + ":" + portNumber + ". Check that the server is running.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void start() {
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            //Read the welcome message from the server
            System.out.println(in.readLine());

            String userInput = null;
            while((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println(in.readLine());
            }
        } catch(IOException e) {
            System.err.println("I/O Exception");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String args[]) {
        String hostName = "192.168.1.5";
        int port = 8081;
        ChatClient chatClient = new ChatClient(hostName,port);
        chatClient.start();
    }
}
