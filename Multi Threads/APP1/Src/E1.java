class  C extends Thread
{

	
	public void run(){
		for (int i=1;i<=100 ;i++ )
		{
		System.out.println("first thread"+i);
		}
	}
}
class  D extends Thread
{

	@Override
	public void run(){
		for (int i=101;i<=200 ;i++ )
		{
		System.out.println("second thread"+i);
		}
	}
}

class E1
{

	public static void main(String[] args) 
	{
		C c1=new C();
		c1.start();
						// it going to register the newly created thread.
					// this is call run method of c calss or d
	
	D d1 =new D();
	d1.start();

	for(int i=201;i<=300;i++){
		System.out.println("main thread "+i);
	}
	}
}
// auto matically one thread in jvm
// need more thread how to create
// two was to threading
//  1. by extanding thread class
//   2. by implementing  runable thread class
// quation what are the two ways of threading 
//this is first approch

