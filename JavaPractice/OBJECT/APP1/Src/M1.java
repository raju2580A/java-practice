class A{
String name;
int rollno;
A(String inname, int inrollno)// intilize
{
this.name=inname;
this.rollno=inrollno;
}
// over -riding
public String toString(){
return name + ""+ rollno;

}
}
class M1{
  public static void main(String[] args){
   A a1=new A("vijay", 101);
A a2=new A("sara", 102);
  System.out.println(a1);
System.out.println(a2);

}
}
// javac -d ../class M1.java
// java -cp ../class M1
// object class is the super most class in java
//among those members to string method 
// use of string method: * in each and every class to string method of object class will be avilable. 
// when ever we trying to print a reference of the class we get memory address of the object. insted of object content
// that is how to string method of object class got implemented by default
// we can able to over ride that object class default string method in such a way that to print the content of that object .
// insted of memory location
// by using to string method  in our class we can able to get the string represantation of our class.
//  programmer created class will not be having implimented by default to string method
// so inside programmer created class by default object class to string method will be avilable
// when ever we call object reference internally it is calling to string method of object class. that to string merhod returns class name @memory-Address
// in a form of exadecimal or #code in the of exadecimal
// for every object unic code will be genirated by jvm it is called '#code'.
//#code does't represent the object of class , jvm will use #code by saving objects into #ing related like data structure
// the most powerfull algaritham is #ing. 
// the main advantage of saving object based on #code, search operating will be easy.