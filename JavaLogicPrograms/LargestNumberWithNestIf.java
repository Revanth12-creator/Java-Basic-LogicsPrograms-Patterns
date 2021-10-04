class LargestNumberWithNestIf
{
 public static void main(String args[])
 {
   int a=50,b=60,c=30;
   if(a>=b)
   { 
    if(a>=c)
     {
      System.out.print(a+" is the Largest Number");
     }
     else
     {
      System.out.print(c+" is the Largest Number");
     }
   } else if(b>=c)
   {
    System.out.print(b+" is the Largest Number");
   }
   else
   {
    System.out.print(c+" is the Largest Number");
  }
 }
}


