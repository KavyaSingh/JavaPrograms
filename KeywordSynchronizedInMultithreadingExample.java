//Basic multithreading 
//synchronized

package MultithreadingExamples;


class PrintClass
{
	 synchronized static void methodNumber()
	{
		 for(int i=1;i<11;i++)
			{
				System.out.print("|"+i);
				
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException e)
				{
					
				}
			}
	}
	
	 synchronized void methodAlpha()
	{
		 for(int i=65;i<75;i++)
			{
			 System.out.print("|"+(char)i);
			 try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException e)
				{
					
				}
			}
	}
	
}
class MyThread27 extends Thread {

	PrintClass dispOb;
	String name;
	
	MyThread27(PrintClass dispOb,String name)
	{
		this.dispOb=dispOb;
		this.name=name;
	}
 	public void run()
	{
			dispOb.methodNumber();
	}
}

class MyThread28 extends Thread {

	PrintClass dispOb;
	String name;
	
	MyThread28(PrintClass dispOb,String name)
	{
		this.dispOb=dispOb;
		this.name=name;
	}
 	public void run()
	{
			dispOb.methodAlpha();
	}
}

public class KeywordSynchronizedInMultithreadingExample
{
	public static void main(String args[])
	{	
		PrintClass dispOb = new PrintClass();
		MyThread27 threadObj1 = new MyThread27(dispOb,"Child Thread 1");
		threadObj1.start();
		MyThread28 threadObj2= new MyThread28(dispOb,"Child Thread 2");
		threadObj2.start();
	}
}
