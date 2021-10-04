class PerfectNumaber
{
 public static void main(String args[])
 {
  int n=7,sum=0;
  int i=1;
  while(i<n)
  {
   if(n%i==0)
   {
   sum=sum+i;
   }
   i++;
  }
  if(sum==n)
  {
  System.out.println("perfect");
  }
  else
  {
  System.out.println("not perfect");
  }
 }
}





