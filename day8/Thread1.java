import java.io.*;
import java.util.*;

public class Thread1 implements Runnable {
	public void run()
	{
		System.out.println("Thread is Running Successfully");
	}
	public static void main(String[] args)
	{
		Thread1 g1 = new Thread1();
		Thread t1 = new Thread(g1);
		t1.start();
	}
}
