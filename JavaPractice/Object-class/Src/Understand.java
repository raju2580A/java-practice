class U  <S>//genaric 
{

	S i,d,b,s,c;
}
class Understand
{

	public static void main(String[] args) 
	{
		U<Integer> i1=new U<Integer>();
		i1=20;

		U<Double> d1=new U<Double>();
		d1=40.5;

		U<Boolean> b1 =new U<Boolean>();
		b1=true;

		U<String> s1=new U<String>();
		s1="abc";

		U<Character> c1=new U<Character>();
		 c1='XYZ';


		System.out.println("Done");
	}
}
