//Basic multithreading 
//IllegalThreadStateException

package MultithreadingExamples;

class MyThread7 extends Thread {


 	public void run()
	{
		System.out.println("Run "+Thread.currentThread() );
	}
 	
}

public class IllegalStateException
{
	public static void main(String args[])
	{	
		MyThread7 threadObj = new MyThread7();
		threadObj.start();
		System.out.println("Main thread "+Thread.currentThread()+" -> "+Thread.currentThread());
		threadObj.start();
	}
}
