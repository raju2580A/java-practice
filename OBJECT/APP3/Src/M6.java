class M6{
public static void main(String [] args){
	   StringBuilder s1 =new StringBuilder("hello");
	 StringBuilder s2 = new StringBuilder("hello");
	   StringBuilder s3= new StringBuilder("hello");//OBJECT IS DIFFRENT BUT GETTING SAME VALUES. 

	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   System.out.println(s3.hashCode());

}
}