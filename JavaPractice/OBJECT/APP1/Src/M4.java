class F{
  int i;
   public String toString(){
  return "this is Object with i value"+i;
}
}
 
class M4{
public static void main(String args[]){
  F f1=new F();
   f1.i=10;
System.out.println(f1);
}
}
// if we don't over-ride Object class to.string method in our class it will get momory Address.
//but if we over-ride to.string method of Object in Our class we will get the content of the object insted of Memory location or address
// usally don't worry about the memory , Only the content Matters.