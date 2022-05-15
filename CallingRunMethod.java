//Basic multithreading 
//In case of t.start a new thread is created which is responsible for execution of run method.
//But in case of t.run, a new thread won't be created and run method will be executed just like a normal
//method call by main thread
package MultithreadingExamples;

class MyThread1 extends Thread {


 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread());
		}
	}
}

public class CallingRunMethod
{
	public static void main(String args[])
	{	
		MyThread1 threadObj = new MyThread1();
		threadObj.run();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
