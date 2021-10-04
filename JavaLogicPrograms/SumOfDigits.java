class SumOfDigits
{
 public static void main(String args[])
 {
  int n=1234,num;
  num=n;
  int r,sum=0;
  while(n>0)
  {
   r=n%10;
   sum=sum+r;
   n=n/10;
  }
  System.out.println(sum);
 }
}