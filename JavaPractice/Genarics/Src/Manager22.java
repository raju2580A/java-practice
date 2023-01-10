class Test <X>
{
}
class Manager22
{	public static void main(String[] args) 
	{
		Test <Integer> a1=null;

		a1=new Test<Integer>();
		a1=new Test<String>();
		a1=new Test<Object>();
		
		
		System.out.println("Done");


	}
}
