class R extends Thread
{
	@Override
		public void run(){Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());// it is a thread it depends on parent thread.
		System.out.println(t1.getId());// by default in java we get user threads, not dameon thread
								// before calling the start method , main thread is not daemon thread
		System.out.println(t1.getPriority());
	}
}

class  S
{
	public static void main(String[] args) 
	{

		R r1=new R();
		r1.start();
		System.out.println("Hello World!");
	}
}
