class F{
public static void main(String args[]) throws Exception
	{
   Class c1= Class.forName("E");

   Class[] c2=c1.getEnumConstatnts();
   int count =0;

for(Object c3:c2){
	System.out.println(c3);
}


   for(int i; i<c2.length; i++)

   count++;
   System.out.println(c3);
   {
	   System.out.println("count"+count);
   }
}
}