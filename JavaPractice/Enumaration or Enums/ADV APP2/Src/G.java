class G{
enum H{
CON1,CON2(90),CON3,CON4("ABC");
H()
{
System.out.println("H()");
}

H(int i){
System.out.println("H(int i):"+i);
}

H(String s1){
System.out.println("H(String i):"+s1);
}
}

public static void main(String args[]){
	 H h1= H.CON4;// loading enum
	 System.out.println("------");
	 System.out.println(h1);
}

}
