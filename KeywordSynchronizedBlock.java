//Basic multithreading 


package MultithreadingExamples;


class DisplayWithSync
{
	void methodSync()
	{
				System.out.println("methodSync : "+Thread.currentThread().getName());
			
		 	synchronized(this)
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
class MyThread29 extends Thread {

	DisplayWithSync dispOb;
	String name;
	
	MyThread29(DisplayWithSync dispOb,String name)
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

public class KeywordSynchronizedBlock
{
	public static void main(String args[])
	{	
		DisplayWithSync dispOb = new DisplayWithSync();
		MyThread29 threadObj1 = new MyThread29(dispOb,"Child Thread 1");
		threadObj1.start();
		MyThread29 threadObj2= new MyThread29(dispOb,"Child Thread 2");
		threadObj2.start();
	}
}
