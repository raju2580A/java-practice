class L
{
	enum M{
		T1,T2,T3{
		void method1(){
			System.out.println("method1() for T3");
		}
	},T4,T5;

void method2(){
			System.out.println("genaral method TEST2");
}
}
public static void main(String[] args) {


	M m1= M.T1;
	M m2= M.T2;
	M m3= M.T3;
	M m4= M.T4;
	M m5= M.T5;

m1.method2();
m2.method2();
m3.method2();
m4.method2();
m5.method2();





		
}
}

