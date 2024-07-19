import java.util.*;
class Multithreaddemo extends Thread{
    public void run()
    {
    
        System.out.println("Thread is running...");
    }
        public static void main(String[] args) {
            int n=5;
            for(int i=0;i<n;i++)
            {
                Multithreaddemo t1=new Multithreaddemo();
                t1.start();

            }
        }
    }
