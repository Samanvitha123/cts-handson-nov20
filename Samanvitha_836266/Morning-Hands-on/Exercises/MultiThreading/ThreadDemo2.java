package multiThreading;

public class ThreadDemo2 {
	public static void main(String args[])
	{
     Counter2 counter=new Counter2();
     Thread t1=new Thread(counter,"A");
     Thread t2=new Thread(counter,"B");
     t1.start();
     t2.start();
     System.out.println("End of the program");

}
}