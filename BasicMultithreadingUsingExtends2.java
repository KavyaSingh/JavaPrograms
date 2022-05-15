//Basic multithreading 
//This works because Thread class implment Runnable
//DO NOT USE
package MultithreadingExamples;

class MyThread12 extends Thread {

	MyThread12(String name)
	{
		super(name);
	}
 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread());
		}
	}
}

public class BasicMultithreadingUsingExtends2
{
	public static void main(String args[])
	{	
		MyThread12 threadObj = new MyThread12("Child-MyThread12");
		Thread th = new Thread(threadObj,"Child-Thread");
		th.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
