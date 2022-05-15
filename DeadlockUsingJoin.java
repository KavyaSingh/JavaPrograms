//Basic multithreading 
//Child thread needs to wait for main thread, so child calls join on main thread
//Take reference of main thread in child thread

package MultithreadingExamples;

class MyThread20 extends Thread {

	Thread mainThread;
	
 	public void run()
	{
 		
		for(int i=0;i<10;i++)
		{
			
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child thread "+Thread.currentThread().getName());
		}
	}
}

public class DeadlockUsingJoin
{
	public static void main(String args[])
	{	
		MyThread20 threadObj = new MyThread20();
		threadObj.mainThread=Thread.currentThread();
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			try {
				threadObj.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main thread  "+Thread.currentThread().getName());
		}
	}
}
