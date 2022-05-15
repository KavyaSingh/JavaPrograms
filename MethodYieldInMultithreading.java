//Basic multithreading 
//Yield method pauses execution of current executing thread to give chance to
//waiting threads of same piority
//If all waiting threads have low priority then same thread can continue
//Some OS do not support yield method hence unpredictable output
package MultithreadingExamples;

class MyThread16 extends Thread {


 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

public class MethodYieldInMultithreading
{
	public static void main(String args[])
	{	
		MyThread16 threadObj = new MyThread16();
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread  "+Thread.currentThread().getName());
		}
	}
}
