class AmstrongNumber1
{
 public static void main(String args[])
 {
  int n=154,r,sum=0,temp;
  temp=n;
  while(n>0)
  {
   r=n%10;
   sum=sum+r*r*r;
   n=n/10;
  }	
  if(temp==sum)
  {
   System.out.print(temp+ "Amstrong");
  }
   else
  {
   System.out.print(temp+ "not Amstrong");
  }
 }
}