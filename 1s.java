import java.net.*;
import java.io.*;
import java.util.Scanner;

public class tcpServer {
    public static void main(String args[]) throws IOException{
        int PORT = 1254;
        ServerSocket soc = new ServerSocket(PORT);
        Socket socket = soc.accept();
        OutputStream socketOutput = socket.getOutputStream();
        DataOutputStream dataOutput = new DataOutputStream(socketOutput);
        Scanner s = new Scanner(System.in);
        System.out.println("Send any msg to client: ");
        String msg = s.nextLine();
        dataOutput.writeUTF("Server: "+ msg);
        dataOutput.close();
        socketOutput.close();
        socket.close();
    }
}
 
