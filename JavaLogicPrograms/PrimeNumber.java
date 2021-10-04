import java.util.*;
class PrimeNumber
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in); 
   System.out.println("enter a number");
   int n=sc.nextInt();//given value
   int count=0;
   for(int i=1;i<=n;i++)
   { 
    if(n%i==0)
    {
     count++;
    }
   }
   if(count==2)
   {
    System.out.println(n+" "+"prime number");
   }
   else
   {
    System.out.println(n+" "+"not prime number");
   }
  }
}
