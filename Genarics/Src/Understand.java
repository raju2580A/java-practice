class U  <S>//genaric 
{

	S i,d,b,s,c;
}
class Understand
{

	public static void main(String[] args) 
	{
		U<Integer> i1=new U<Integer>();
		i1.i=20;

		U<Double> d1=new U<Double>();
		d1.d=40.0;

		U<Boolean> b1 =new U<Boolean>();
		b1.b=true;

		U<String> s1=new U<String>();
		s1.s="abc";

		
		U<Character> c1=new U<Character>();
		 c1.c='R';



		 System.out.println(i1.i);
		 System.out.println(d1.d);
		 System.out.println(b1.b);
		 System.out.println(s1.s);
		 System.out.println(c1.c);



		System.out.println("Done");
	}
}
