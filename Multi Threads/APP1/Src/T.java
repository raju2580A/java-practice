class T 
{
	public static void main(String[] args) 
	{

		Thread t1= Thread.currentThread();
		
		System.out.println(t1.getName());

		System.out.println("before calling main method");
		t1.setName("new name for main Thread");
		System.out.println("after callinfg main thread");
		System.out.println(t1.getName());
	}
}
