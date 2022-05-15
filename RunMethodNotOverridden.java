//Basic multithreading 
//If we do not override run method, thread class run method gets executed which has
//empty implementation. So Thread class run method is called which has empty implementation.
//Highly recommended to override run method
package MultithreadingExamples;

class MyThread4 extends Thread {
 	
}

public class RunMethodNotOverridden
{
	public static void main(String args[])
	{	
		MyThread4 threadObj = new MyThread4();
		threadObj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread "+Thread.currentThread());
		}
	}
}
