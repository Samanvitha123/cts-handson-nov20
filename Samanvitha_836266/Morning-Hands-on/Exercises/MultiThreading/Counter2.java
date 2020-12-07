package multiThreading;

public class Counter2 implements Runnable{
	@Override
	public synchronized void run()
	{
		Thread t=Thread.currentThread();
		for(int i=1;i<=100;i++)
		{
			System.out.println("Counter: "+i+",name is: "+t.getName());;
		}
		
	}

}
