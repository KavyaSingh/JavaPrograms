//Basic multithreading
//Runnable interface is in java.lang package and
//it contains only one method that is the run method
package MultithreadingExamples;

class RunnableClass implements Runnable {

 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread());
		}
	}
}

public class ImplementingRunnableInterface
{
	public static void main(String args[])
	{	
		RunnableClass runnableObj = new RunnableClass();
		Thread threadObj = new Thread(runnableObj);
		threadObj.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
