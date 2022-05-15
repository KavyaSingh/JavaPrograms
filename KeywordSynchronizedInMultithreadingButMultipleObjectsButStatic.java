//Basic multithreading 
//Even with different objects, the output is regular because the method is static
//In this case, the threads require class level locks

package MultithreadingExamples;


class DisplayClass1
{
	synchronized static void methodSync()
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
class MyThread26 extends Thread {

	DisplayClass1 dispOb;
	String name;
	
	MyThread26(DisplayClass1 dispOb,String name)
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

public class KeywordSynchronizedInMultithreadingButMultipleObjectsButStatic
{
	public static void main(String args[])
	{	
		DisplayClass1 dispOb = new DisplayClass1();
		MyThread26 threadObj1 = new MyThread26(dispOb,"Child Thread 1");
		threadObj1.start();
		DisplayClass1 dispObAnother = new DisplayClass1();
		MyThread26 threadObj2= new MyThread26(dispObAnother,"Child Thread 2");
		threadObj2.start();
	}
}
