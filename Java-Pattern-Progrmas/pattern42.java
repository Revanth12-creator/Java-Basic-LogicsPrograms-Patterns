class pattern42
{
 public static void main(String args[])
 {
  char min_letters='A';
  for(char i='A';i<='E';i++)
  {
   for(char j='D';j>=i;j--)                               /*       A         */
   {                                                      /*      ABC       */
    System.out.print(" ");                                /*     ABCDE       */
   }                                                      /*    ABCDEFG      */
   for(char k='A';k<=min_letters;k++)                     /*   ABCDEFGHI     */
   {
    System.out.print(k);
   }
   min_letters +=2;
   System.out.println();
  }
 }
}