class L
{
	public static void main(String[] args) 
	{
		String s1="java is very easy and fun and Exciting";
				 //01234567891123456789212345678931234567  	
		
		int i=s1.indexOf("fun");
		System.out.println(i);

		int j=s1.indexOf("and",22);//(begin, end)
		System.out.println(j);
		
	}
}
