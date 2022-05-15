//Basic multithreading 
//If t1 calls t2.join() then t1 will enter into waiting state until t2 completes
//Once t2 completes then t1 will continue its execution
package MultithreadingExamples;

class MyThread17 extends Thread {

 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

public class MethodJoinInMultithreading
{
	public static void main(String args[])
	{	
		MyThread17 threadObj = new MyThread17();
		threadObj.start();
		try {
			threadObj.join();  //Main thread wants to wait until child thread completes, so main calls join on child
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread  "+Thread.currentThread().getName());
		}
	}
}
