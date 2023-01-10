class M16{
 int i;
}

class F{
  int i;
	float(int i){
this.i=i;
}

}
  public boolean equals(Object obj){
   if (!(obj instanceof F))  
  return false;

F ref=(F)obj;
  boolean flag=this.i == ref.i);
return flag;

}



  public static void main(String args[]){
    F f1 =new F(90);
	F f2=new F(90);

System.out.println(f1 ==f2);
System.out.println(f1.equals(F2));
F f3=f2;
System.out.println(f3 ==f2);
System.out.println(f3.equals(F2));


	System.out.println(f3.i == f2.i);



	A a1=new A();
a1.i=90;

System.out.println(a1.i==f1.i);
System.out.println(f1.equals(a1));

}
}