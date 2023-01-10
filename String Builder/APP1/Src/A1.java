class  A1
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("hellotoallofyou");

System.out.println(sb); //what ever the methods in StringBuffer That all have in StringBuilder also.
	}
}
// difference= StringBuffer is sincronised and builder is not
// in case of string all the three methods override 1 tostring 2.equals 3. hashcode
// in in String Buffer only toString override.
// we can create a new operatoer without String builder
// plus operator(+) only overload in String not with StringBuffer And Builder.
// Stringbuffer and stringbuilder
// by using String comparable interface we can achve sorting based on content. we not do it in buffer and buildwe.
//String class we not have reverse method , in the String class there is no delete.