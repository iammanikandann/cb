import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpClient {
    public static void main(String[] args) throws IOException{

        //Declare Scanner variable to get input from client
        Scanner sc = new Scanner(System.in);

        //Create a socket
        DatagramSocket ds = new DatagramSocket();

        //get ip address of client
        InetAddress ip = InetAddress.getLocalHost();

        //Declare recv buffer
        byte buf[] = null;

        while(true) {

            //get input from usr
            String inp = sc.nextLine();

            //String to bytes
            buf = inp.getBytes();

            //Create a datagram packet
            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 2233);

            //Send to server
            ds.send(DpSend);

            //disconnect from server
            if (inp.equals("bye")) {
                break;
            }
        }

    }
}
