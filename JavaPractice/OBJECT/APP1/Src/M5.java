class G{
int i;
   public String toString(){
return "Its type of object with i Valueas:"+i;

}
}

class M5{
   public static void main(String args[]){
   G g1=new G();
    g1.i=20;
System.out.println(g1);
  	String s1= "Dsc:" +g1;
System.out.println(s1);
}
}

// when ever try to print a reference it will be calling tostring method internally.