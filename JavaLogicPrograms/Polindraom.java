class Polindraom
{
 public static void main(String args[])
 {
  int n=127

,temp,r;
  int sum=0;
  temp=n;
  while(n>0)
  {
   r=n%10;
   sum=sum*10+r;
   n=n/10;
  }
  if(sum==temp)
   System.out.println("polindraom");
   else
   System.out.println("not polindraom");
 }
}