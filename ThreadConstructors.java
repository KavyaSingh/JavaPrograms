//Basic multithreading 
package MultithreadingExamples;

class MyThreadConstructor extends Thread {

	MyThreadConstructor(String name)
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

public class ThreadConstructors
{
	public static void main(String args[])
	{	
		MyThreadConstructor threadObj = new MyThreadConstructor("Child");
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
