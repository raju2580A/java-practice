class X extends Thread
{
	@Override
		public void run()
	{
		System.out.println("from run method of x class");
		Thread t1 =Thread.currentThread();
		System.out.println("child Thread priority"+t1.getPriority());
		System.out.println("child Thread name"+t1.getName());
}
}

class Y
{
	public static void main(String[] args) 
	{
		X x1=new X();
		x1.start();
		System.out.println(x1.getName());
		x1.setName("first child");
		System.out.println(x1.getName());

		Thread t1 =Thread.currentThread();
		System.out.println("child Thread priority"+t1.getPriority());
		System.out.println("child Thread name"+t1.getName());
	}
}
