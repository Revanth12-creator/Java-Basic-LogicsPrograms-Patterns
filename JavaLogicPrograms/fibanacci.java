class fibanacci
{
 public static void main(String args[])
 {
  int f1=0,f2=1,f3;
  int n=8;
  System.out.println(f1);
System.out.println(f2);
  while(n>0)
  {
   f3=f1+f2;
   f1=f2;
   f2=f3;
   System.out.println(f3);
  n--;
 }
 }
}