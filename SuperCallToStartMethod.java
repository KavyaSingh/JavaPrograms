//Basic multithreading 
//If start method is calling super, that allows creaton of a new thread
//So this program demonstrates multithreading

package MultithreadingExamples;

class MyThread6 extends Thread {


 	public void run()
	{
		System.out.println("Run "+Thread.currentThread() );
	}
 	
 	public void start()
	{
 		super.start();
		System.out.println("Start "+Thread.currentThread());
	}
}

public class SuperCallToStartMethod
{
	public static void main(String args[])
	{	
		MyThread6 threadObj = new MyThread6();
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread()+" -> "+Thread.currentThread());
		}
	}
}
