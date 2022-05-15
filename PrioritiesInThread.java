//Basic multithreading 
//Only for main thread default priority is 5
//For all other threads, priority is inherited from main thread
package MultithreadingExamples;

class MyThread15 extends Thread {


 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread().getPriority());
		}
	}
}

public class PrioritiesInThread
{
	public static void main(String args[])
	{	
		Thread.currentThread().setPriority(1);
		MyThread15 threadObj = new MyThread15();
		threadObj.setPriority(10);
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread with priority "+Thread.currentThread().getPriority());
		}
	}
}
