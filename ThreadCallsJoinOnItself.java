package MultithreadingExamples;
class ThreadCallsJoinOnItself
{
	public static void main(String args[])
	{
		try
		{
			System.out.print("Current thread "+Thread.currentThread().getName());
			Thread.currentThread().join();
			System.out.print("Current thread after join"+Thread.currentThread().getName());
		}
		catch(InterruptedException e)
		{
			
		}
		
	}
}