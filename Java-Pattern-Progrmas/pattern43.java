class pattern43
{
 public static void main(String args[])
 {
  char min_letters=0;
  for(char i='A';i<='E';i++)
  {
   for(char j='D';j>=i;j--)                               /*       A         */
   {                                                      /*      CBA       */
    System.out.print(" ");                                /*     EDCBA       */
   }                                                      /*    GFEDCBA      */
   for(int k=0 ;k<=min_letters;k++)                       /*   IHGFEDCBA     */
   {
    System.out.print((char)(min_letters-k+65));
   }
   min_letters +=2;  
   System.out.println();
  }
 }
}