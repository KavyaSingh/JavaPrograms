//Basic multithreading 
//interrupt method handling is taken care by JVM. 
//Whenever we call interrupt method, if the target thread is not in sleeping state, 
//then there is no impact of interrupt call immediately. 
//interrupt call will be waited until target thread entered into sleeping or waiting state.
//interrupt call is wated if the target thread never entered into sleeping or waiting state in its lifetime


package MultithreadingExamples;

class MyThread23 extends Thread {

 	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("Child thread "+i);
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print("Child got interrupted");
		}
	}
}

public class MethodInterruptWaitsUntilSleep
{
	public static void main(String args[])
	{	
		MyThread23 threadObj = new MyThread23();
		threadObj.start();
		threadObj.interrupt();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread  "+Thread.currentThread().getName());
		}
	}
}
