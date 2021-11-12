import java.rmi.*;
import java.rmi.registry.*;

public class OperationServer
{
    public static void main(String args[])throws RemoteException
    {
        Registry registry = LocateRegistry.createRegistry(4000);
        try {
            opiml impl=new opiml();
            registry.rebind("hello",impl);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}