//Basic multithreading 
//If we do not declare methodSync as  then both threads will be executed simultaneously 
//and hence we will get irregular output.
//If we declare it as synchronized then at a time only 1 thread is allowed to execute the method.



package MultithreadingExamples;


class Display
{
	synchronized void methodSync()
	{
		 for(int i=0;i<10;i++)
			{
				System.out.println("Current thread in methodSync : "+Thread.currentThread().getName());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.print("Interrupted "+Thread.currentThread().getName());
				}
			}
	}
}
class MyThread24 extends Thread {

	Display dispOb;
	String name;
	
	MyThread24(Display dispOb,String name)
	{
		this.dispOb=dispOb;
		this.name=name;
	}
 	public void run()
	{
			System.out.println("Child thread "+Thread.currentThread().getName());
			dispOb.methodSync();
	}
}

public class KeywordSynchronizedInMultithreading
{
	public static void main(String args[])
	{	
		Display dispOb = new Display();
		MyThread24 threadObj1 = new MyThread24(dispOb,"Child Thread 1");
		threadObj1.start();
		MyThread24 threadObj2= new MyThread24(dispOb,"Child Thread 2");
		threadObj2.start();
	}
}
