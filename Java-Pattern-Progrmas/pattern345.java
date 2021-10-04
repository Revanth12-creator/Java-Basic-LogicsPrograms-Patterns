class pattern345
{
 public static void main(String args[])
 {
  int n=5;
  int minStarts=1; 
  for(int i=1;i<n;i++)
  {
   for(int j=n-1;j>i;j--)
   {
    System.out.print(" ");
   }
   for(int k=0;k<minStarts;k++)
   {
    System.out.print("*");   
   }
   minStarts +=2; 
   System.out.println();                                    
  }                                                 
 }
}