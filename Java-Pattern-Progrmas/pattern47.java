class pattern47
{
 public static void main(String args[])
 {
  int min_numbers=9;
  for(int i=5;i>=1;i--)
  {                                                       /* 555555555   */
   for(int j=5;j>i;j--)                                   /*  4444444    */
   {                                                      /*   33333     */
    System.out.print(" ");                                /*    222      */
   }                                                      /*     1       */
   for(int k=1;k<=min_numbers;k++)                          
   {
    System.out.print(i);
   } 
   min_numbers -=2;
   System.out.println();
  }
 }
}