class pattern45
{
 public static void main(String args[])
 {
  int min_numbers=1;
  for(char i=1;i<=5;i++)
  {
   for(char j=4;j>=i;j--)                                 /*       0        */
   {                                                      /*      101       */
    System.out.print(" ");                                /*     21012       */
   }                                                      /*    3210123      */
   for(int k=min_numbers ;k>=1;k--)                       /*   432101234     */
   {
    System.out.print(Math.abs(k-i));
   }
   min_numbers +=2;  
   System.out.println();
  }
 }

}