class pattern44
{
 public static void main(String args[])
 {
  int min_numbers=1;
  for(char i=1;i<=5;i++)
  {
   for(char j=4;j>=i;j--)                                 /*       1        */
   {                                                      /*      321       */
    System.out.print(" ");                                /*     54321       */
   }                                                      /*    7654321      */
   for(int k=1 ;k<=min_numbers;k++)                       /*   987654321     */
   {
    System.out.print((char)(min_numbers-k+49));
   }
   min_numbers +=2;  
   System.out.println();
  }
 }
}