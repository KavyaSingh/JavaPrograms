//Basic multithreading 
//Not recommended to use join or sleep when expecting updation


package MultithreadingExamples;

class MyThread31 extends Thread {

	int total=0;
 	public void run()
	{
		for(int i=0;i<50;i++)
		{
			total=total+i;
		}
		
		//calculation ends here but main thread still has to wait until all lines of MyThread31 completes
		for(int i=0;i<50;i++)
		{
			System.out.println("Child thread -> "+i);
		}
	}
}

public class InterthreadCommunicationUsingJoin
{
	public static void main(String args[])
	{	
		System.out.println("Main thread");
		MyThread31 threadObj = new MyThread31();
		threadObj.start();
		

		synchronized(threadObj)
		{
			System.out.println("Main thread trying to call join");
			try {
				threadObj.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("threadObj total: "+threadObj.total);
	}
}
