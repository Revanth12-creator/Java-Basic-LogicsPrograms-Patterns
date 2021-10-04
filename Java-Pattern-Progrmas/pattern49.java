class pattern49
{
 public static void main(String args[])
 {
  int min_numbers=9;
  for(int i=5;i>=1;i--)
  {                                                       /* 123456789  */
   for(int j=5;j>i;j--)                                   /*  1234567    */
   {                                                      /*   12345     */
    System.out.print(" ");                                /*    123      */
   }                                                      /*     1       */
   for(int k=1;k<=min_numbers;k++)                          
   {
    System.out.print(k);
   } 
   min_numbers -=2;
   System.out.println();
  }
 }
}