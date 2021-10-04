class pattern39
{
 public static void main(String args[])
 {
  char min_letters='A';
  for(char i='A';i<='E';i++)
  {
   for(char j='D';j>=i;j--)                               /*       A         */
   {                                                      /*      BBB        */
    System.out.print(" ");                                /*     CCCCC       */
   }                                                      /*    DDDDDDD      */
   for(char k='A';k<=min_letters;k++)                     /*   EEEEEEEEE     */
   {
    System.out.print(i);
   }
   min_letters +=2;
   System.out.println();
  }
 }
}