//Basic multithreading 
//If t1 calls t2.join() then t1 will enter into waiting state until t2 completes
//Once t2 completes then t1 will continue its execution
package MultithreadingExamples;

class MyThread18 extends Thread {

 	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MethodJoinSleepInMultithreading
{
	public static void main(String args[])
	{	
		MyThread18 threadObj = new MyThread18();
		threadObj.start();
		try {
			threadObj.join(4000);  //Main thread wants to wait until child thread completes, so main calls join on child
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
