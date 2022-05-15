package MultithreadingExamples;

public class ThreadInterruptingAnotherThread {

	public static void main(String args[])
	{
		MyThread22  threadOb = new MyThread22 ();
		threadOb.start();
		System.out.println("Main thread ");	
		threadOb.interrupt();
	}
	
}


class MyThread22 extends Thread
{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread MyThread22 "+i);
			try
			{
			Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{		
			
			System.out.println("Child thread MyThread22 got interrupted");		
						
			}
		}
	}
}