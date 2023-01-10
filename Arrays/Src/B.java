class B
{
	public static void main(String args[]){
		int x[]=new int[3];
		//default values
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

		x[0]=1;
		x[1]=2;
		x[2]=3;
		System.out.println("--------");
		//recently Assigned values
		System.out.println(x.length);
		System.out.println("--------");


		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}