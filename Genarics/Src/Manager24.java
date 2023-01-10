class Test <X>
{
}
class Manager24
{	public static void main(String[] args) 
	{
		Test <?> a1=null;//Test <?>  means any of the type using Wild type character a1=null;

		a1=new Test<Integer>();
		a1=new Test<String>();
		a1=new Test<Object>();
		
		
		System.out.println("Done");


	}
}
