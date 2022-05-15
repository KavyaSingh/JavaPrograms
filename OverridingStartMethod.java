//Basic multithreading 
//Start method will be called like a normal method call
//New thread won't be created

package MultithreadingExamples;

class MyThread5 extends Thread {


 	public void run()
	{
		System.out.println("Run");
	}
 	
 	public void start()
	{
		System.out.println("Start");
	}
}

public class OverridingStartMethod
{
	public static void main(String args[])
	{	
		MyThread5 threadObj = new MyThread5();
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
