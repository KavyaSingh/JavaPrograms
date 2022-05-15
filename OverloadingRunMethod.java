//Basic multithreading 
//Overloading run method
//Overloading of run method is always possible but thread class start method
//can invoke no arg run method only. The other overloaded method we have to call explicitly 
//like a normal method call.

package MultithreadingExamples;

class MyThread2 extends Thread {


 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread());
		}
	}
 	
 	public void run(int j)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread arg "+j+" - "+Thread.currentThread());
		}
	}
}

public class OverloadingRunMethod
{
	public static void main(String args[])
	{	
		MyThread2 threadObj = new MyThread2();
		threadObj.run();
		threadObj.run(50);
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
