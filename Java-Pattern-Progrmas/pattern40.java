class pattern40
{
 public static void main(String args[])
 {
  char min_letters='A';
  for(char i='A';i<='E';i++)
  {
   for(char j='D';j>=i;j--)                               /*       A         */
   {                                                      /*      CCC        */
    System.out.print(" ");                                /*     EEEEE       */
   }                                                      /*    GGGGGGG      */
   for(char k='A';k<=min_letters;k++)                     /*   IIIIIIIII     */
   {
    System.out.print(min_letters);
   }
   min_letters +=2;
   System.out.println();
  }
 }
}