//Basic multithreading 
package MultithreadingExamples;

class MyThread extends Thread {


 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread");
		}
	}
}

public class BasicMultithreadingUsingExtends
{
	public static void main(String args[])
	{	
		MyThread threadObj = new MyThread();
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}
	}
}
