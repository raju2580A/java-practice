class E <A,B> 
{
	A i,j;
	B m,n;
	String p,q;

}
class Manager5
{

	public static void main(String[] args) 
	{
		E <String ,String>e1 = new <String,String >();
		E <Integer ,String>e2 = new <Integer,String >();
			e1.i="abc";
			e1.j="abc";
			e1.m="abc";
			e1.n="abc";
			e1.p="abc";
			e1.q="abc";
		
		e1.i=20;
			e1.j=40;
			e1.m="abc";
			e1.n="abc";
			e1.p="abc";
			e1.q="abc";
			System.out.println("Done");
		
	
	}	
	
}
