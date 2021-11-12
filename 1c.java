import java.net.*;
import java.io.*;

public class tcpClient {
    public static void main(String args[]) throws IOException{
        int PORT = 1254;
        String HOST = "localhost";
        Socket socket = new Socket(HOST, PORT);
        InputStream socketInput = socket.getInputStream();
        DataInputStream dataInput = new DataInputStream(socketInput);
        String str = new String(dataInput.readUTF());
        System.out.println(str);
        dataInput.close();
        socketInput.close();
        socket.close();
    }
}
