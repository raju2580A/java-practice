class M5{
public static void main(String [] args){
	   StringBuffer s1 =new StringBuffer("hello");
	  StringBuffer s2 = new StringBuffer("hello");
	   StringBuffer s3= new StringBuffer("hello");//OBJECT IS DIFFRENT BUT GETTING SAME VALUES. 

	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   System.out.println(s3.hashCode());

}
}