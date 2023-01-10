class R 
{
	public static void main(String[] args) 
	{
		String s1=null;// try and catch use to avoid null pointer exception
		try{

		System.out.println(s1.length());
	}
	catch (NullPointerException ex){
	}
	}
	System.out.println("End");

}
