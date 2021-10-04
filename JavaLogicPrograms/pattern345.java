class pattern345
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=n;i>=1;i--)
  {
   for(int j=1;j<=n-2;j--)
   {
    System.out.println(" ");
   }
   for(int k=5;k>=i;k--)
   {
    System.out.println("*");   
   }
   System.out.println("*");                            /*       *         */                           /*      ***        */  
  }                                                 /*     *****       */                         /*    *******      */                                                     /*   *********     */
 }
}