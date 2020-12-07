package multiThreading;

public class Counter implements Runnable {
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++) {
			System.out.println("Counter: "+i+"Thread: "+Thread.currentThread().getName());
		}
	}

}
