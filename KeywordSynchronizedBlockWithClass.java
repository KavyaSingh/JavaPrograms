//Basic multithreading 


package MultithreadingExamples;


class DisplayWithSyncAndClassName
{
	void methodSync()
	{
				System.out.println("methodSync : "+Thread.currentThread().getName());
			
		 	synchronized(DisplayWithSyncAndClassName.class)
		 	{
		 		for(int j=0;j<10;j++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+j+" ");
				}	
		 	}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.print("Interrupted "+Thread.currentThread().getName());
			}
	}
}
class MyThread30 extends Thread {

	DisplayWithSyncAndClassName dispOb;
	String name;
	
	MyThread30(DisplayWithSyncAndClassName dispOb,String name)
	{
		this.dispOb=dispOb;
		this.name=name;
	}
 	public void run()
	{
			//System.out.println("Child thread "+Thread.currentThread().getName());
			dispOb.methodSync();
	}
}

public class KeywordSynchronizedBlockWithClass
{
	public static void main(String args[])
	{	
		DisplayWithSyncAndClassName dispOb = new DisplayWithSyncAndClassName();
		MyThread30 threadObj1 = new MyThread30(dispOb,"Child Thread 1");
		threadObj1.start();
		MyThread30 threadObj2= new MyThread30(dispOb,"Child Thread 2");
		threadObj2.start();
	}
}
