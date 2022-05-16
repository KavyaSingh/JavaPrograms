
public class MultithreadingWithAnonymousInnerClass
{
	
	public static void main(String args[])
	{
		Runnable runnableObj = new Runnable ()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
					System.out.println("Child thread-> "+Thread.currentThread().getName());
				
			}
		};
		
		Thread thObj = new Thread(runnableObj);
		thObj.start();
		for(int i=0;i<10;i++)
					System.out.println("Main thread-> "+Thread.currentThread().getName());
	}



}