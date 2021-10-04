class SwapingTwoNumbers
{
 public static void main (String args[])
 {
  int a=80;
  int b=50;
  a=a+b;
  b=a-b;
  a=a-b;

  System.out.println("a=:"+a);
  System.out.println("b=:"+b);
 }
}