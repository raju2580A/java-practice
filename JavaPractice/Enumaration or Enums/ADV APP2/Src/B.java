enum A {
	C1,C2,C3;
	A(){
		System.out.println("V()");
	}
}
class B
{
  public static void main(String args[]){
	  A a1 =A.C3;
	  System.out.println(a1);
  }
}
// all the declared constents are static
//in enum also we can access constructor
// for each and every constent loding constructor will exugute. 