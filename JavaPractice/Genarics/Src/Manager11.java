interface J<A>
{
	void test1(A a1);
	A test2(A1 a1,int i);
}




class  K implements J<String>
{
	public void test1(String s1)
	{
	}
	public String test2(String s1,int i){
		return s1;
	}




class L implements J<Integer>
	{
	
	public Integer test2(Integer i,int j){
		return i;

	}
}
class Manager11
		{
		

	public static void main(String[] args) 
	{

		System.out.println("Done");
	}
}
