//Basic multithreading 
//Not recommended to use join or sleep when expecting updation


package MultithreadingExamples;

class MyThread32 extends Thread {

	int total=0;
 	public void run()
	{
 		synchronized(this)
		{
 			System.out.println("Child thread starts calculation");
 			for(int i=0;i<50;i++)
 			{
 				total=total+i;
 			}
 			System.out.println("Child thread completes calculation");
 			this.notify();
		}
		
		for(int i=0;i<50;i++)
		{
			System.out.println("Child thread -> "+i);
		}
	}
}

public class InterthreadCommunicationUsingWait
{
	public static void main(String args[])
	{	
		System.out.println("Main thread");
		MyThread32 threadObj = new MyThread32();
		threadObj.start();
		

		synchronized(threadObj)
		{
			System.out.println("Main thread trying to call wait");
			try {
				threadObj.wait();
				System.out.println("Main thread got notification");
				System.out.println("threadObj total: "+threadObj.total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
