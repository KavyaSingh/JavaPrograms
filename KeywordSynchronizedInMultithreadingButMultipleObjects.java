//Basic multithreading 
//This will not have synchronized output because each thread is operating on its own DisplayClass object.
//Both child threads have their own DisplayClass objects to access the methodSync
//If multiple threads are operating on same java object, then synchronization is  required

package MultithreadingExamples;


class DisplayClass
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
class MyThread25 extends Thread {

	DisplayClass dispOb;
	String name;
	
	MyThread25(DisplayClass dispOb,String name)
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

public class KeywordSynchronizedInMultithreadingButMultipleObjects
{
	public static void main(String args[])
	{	
		DisplayClass dispOb = new DisplayClass();
		MyThread25 threadObj1 = new MyThread25(dispOb,"Child Thread 1");
		threadObj1.start();
		DisplayClass dispObAnother = new DisplayClass();
		MyThread25 threadObj2= new MyThread25(dispObAnother,"Child Thread 2");
		threadObj2.start();
	}
}
