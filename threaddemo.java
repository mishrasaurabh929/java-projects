import java.util.*;
class First extends Thread
{
	Random r=new Random();
	void run()
	{
		int num=0;
		num=r.nextInt();
		System.out.println(num);
		Thread t2 = new Thread(new Second(num));
		t2.start();
		Thread t3 = new Thread(new Third(num));
		t3=start();
	}
}
class Second extends Thread
{
	int x;
	public Second(int x)
	{
		this.x=x;
		System.out.println("square" +(x*x));
	}
	/*public void run()
	{
		System.out.println("square" +(x*x));
	}*/
}
class Third extends Thread
{
	int x;
	public Third(int x)
	{
		this.x=x;
		System.out.println("square" +(x*x*x));
	}
	/*public void run()
	{
		System.out.println("square" +(x*x*x));
	}*/
}

public class Thread 
{
	public static void main(String args[])
	{
		First first=new First();
		first.start();
	}
}
