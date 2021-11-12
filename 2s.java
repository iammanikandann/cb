import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpServer {
    public static void main(String[] args) throws IOException {

        //Create a socket
        DatagramSocket ds = new DatagramSocket(2233);

        //byte variable to receive data
        byte[] receive = new byte[65535];

        //Initialize receive packet
        DatagramPacket packetRecv = null;

        while(true){

            //Declare recv packet
            packetRecv = new DatagramPacket(receive, receive.length);

            //Recv data
            ds.receive(packetRecv);

            //print the data which was recv
            System.out.println("Client says "+ data(receive) + " :)");

            //Exit from loop
            if(data(receive).toString().equals("bye")){
                System.out.println("Client says bye so disconnecting...");
                break;
            }

            //Emtpty the buffer
            receive = new byte[65535];

        }
    }

    //Convert recv data to a string
    public static StringBuilder data(byte[] a){
        if(a == null){
            return null;
        }
        //declare stringbuilder variable
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while(a[i] != 0){
            ret.append((char) a[i]);
            i++;
        }
        return ret;

    }
}  
