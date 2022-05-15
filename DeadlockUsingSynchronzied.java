//Synchronized keyword is the only situation for deadlock

package MultithreadingExamples;

public class DeadlockUsingSynchronzied {

	public static void main(String args[])
	{
		System.out.println("Main thread");
		DeadlockThread1 thread1 = new DeadlockThread1();
		thread1.run();
		DeadlockThread2 thread2 = new DeadlockThread2();
		thread2.run();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread finished");
	}
}

class DeadlockThread1 extends Thread
{
	public void run()
	{
		System.out.println("DeadlockThread1");
		DeadlockThread2 d2 = new DeadlockThread2();
		synchronized(d2)
		{
			System.out.println("DeadlockThread1 for DeadlockThread2");
			DeadlockThread2.total(10);
			try {
				d2.wait();
				this.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DeadlockThread1 for DeadlockThread2 finished ");

	}
	public static void total(int num)
	{
		System.out.println("total : "+num*num);

	}
}

class DeadlockThread2 extends Thread
{
	public void run()
	{
		System.out.println("DeadlockThread2");
		DeadlockThread1 d1 = new DeadlockThread1();
		synchronized(d1)
		{
			System.out.println("DeadlockThread2 for DeadlockThread1");
			d1.total(20);
			try {
				d1.wait();
				this.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DeadlockThread2 for DeadlockThread1 finished ");

	}
	
	public static void total(int num)
	{
		System.out.println("total : "+num*num);

	}
}