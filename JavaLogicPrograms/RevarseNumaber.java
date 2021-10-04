class RevarseNumaber
{
 public static void main(String args[])
 {
  int n=1234,r,d=0;
  while(n>0)
  {
   r=n%10;
   d=d*10+r;
   n=n/10;
  }
    System.out.println(d);
 }
}





