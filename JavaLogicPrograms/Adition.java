import java.util.*;
class Adition
{
  int add(int a,int b)
  { 
   return a+b;
  }
  int add(int a,int b,int c)
  {
   return a+b+c;
  }
class test
{
 public static void main(String args[])
 {
  Adition a=new Adition();
   System.out.println(a.add(10,20));
   System.out.println(a.add(30,40,50));
 }
 }
}