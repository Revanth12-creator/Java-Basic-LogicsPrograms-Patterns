public class Test{
public Test() {
this(10);
 System.out.println("A");
}
private Test(int val) 
{ 
this( "Hello "); 
System.out.println( "B");
}
protected Test(String val) { 
System.out.println( "C");
}
public static void main(String[] args) 
{
 Test testaner=new Test();
}
}