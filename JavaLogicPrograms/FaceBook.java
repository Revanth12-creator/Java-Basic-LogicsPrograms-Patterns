import java.util.*;
class Adition
{
  void add(int a,int b)
  { 
   System.out.println("Login with the UserName and Password");
   return a+b;
  }
  void add(int a,int b,int c)
  { 
   System.out.println("Login with the Mobli Number");
   return a+b+c;
  }
}
class test
{
 public static void main(String args[])
 {
  Adition a=new Adition();
   System.out.println(a.add(10,20));
   System.out.println(a.add(30.40,50));
 }
 }
}