import java.io.*;
import java.rmi.*;
import java.net.*;
import java.lang.NumberFormatException;

public class OperationClient
{
    public static void main(String arg[])throws RemoteException, NotBoundException, MalformedURLException
    {
        try
        {
            int a,b,ch;
            String str,str1;
            DataInputStream in=new DataInputStream(System.in);
            opin obj = (opin)Naming.lookup("rmi://localhost:4000/hello");
            do
            {
                System.out.println("ARITHMATIC OPERATION");
                System.out.println("1.ADDITION");
                System.out.println("2.SUBTRACTION");
                System.out.println("3.MULTIPLICATION");
                System.out.println("4.DIVITION");
                System.out.println("5.MODULUS");
                System.out.println("6.C->F CONVERSION");
                System.out.println("7.F->C CONVERSION");
                System.out.println("8.CGPA");
                System.out.println("9.EXIT");
                System.out.println("ENTER YOUR OPTION :");
                str1=in.readLine();
                ch=Integer.parseInt(str1);
                switch(ch)
                {
                    case 1: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("Enter the value for B:");
                        str=in.readLine();
                        b=Integer.parseInt(str);
                        System.out.println("ADD="+obj.add(a,b));
                    }
                    case 2: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("Enter the value for B:");
                        str=in.readLine();
                        b=Integer.parseInt(str);
                        System.out.println("SUB="+obj.sub(a,b));
                    }
                    case 3: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("Enter the value for B:");
                        str=in.readLine();
                        b=Integer.parseInt(str);
                        System.out.println("MUL="+obj.mul(a,b));
                    }
                    case 4: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("Enter the value for B:");
                        str=in.readLine();
                        b=Integer.parseInt(str);
                        System.out.println("DIV="+obj.div(a,b));
                    }
                    case 5: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("Enter the value for B:");
                        str=in.readLine();
                        b=Integer.parseInt(str);
                        System.out.println("MOD="+obj.mod(a,b));
                    }
                    case 6: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("FARENHEIT="+obj.convcf(a));
                    }
                    case 7: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("CELCIUS="+obj.convfc(a));
                    }
                    case 8: {
                        System.out.println("Enter the value for A:");
                        str=in.readLine();
                        a=Integer.parseInt(str);
                        System.out.println("GRADE="+obj.cgpa(a));
                    }
                }
            }while(ch!=9);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
} 
