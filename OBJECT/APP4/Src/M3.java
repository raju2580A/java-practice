class A
{
	//protected void finalize()
	public void finalize()
	{
		System.out.println("From finalize");
		for(i=1; i<=200;i++){
			System.out.println(i);
		}
	}
}
class M3
{
	public static void main(String args[]){
		A a1=new A();
		a1=null;
		Runtime.getRuntime
().gc();
		for(i=1; i<=200;i++){
			System.out.println(i);
		System.out.println("program end");
		
		}
	}
