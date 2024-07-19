
import java.util.*;
class A extends Thread
{
    public void run()
    {
        try{
            System.out.println("Thread");
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }
    }
    public static void main(String args[])
    {
        A a1=new A();
        a1.start();
        A a2=new A();
        a2.start();
    }
}