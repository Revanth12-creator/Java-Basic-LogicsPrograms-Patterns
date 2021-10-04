class pattern50
{
 public static void main(String args[])
 {
  char min_char=9;
  for(char i='E';i>='A';i--)
  {                                                       /* EEEEEEEEE  */
   for(char j='E';j>i;j--)                                /*  DDDDDDD    */
   {                                                      /*   CCCCC    */
    System.out.print(" ");                                /*    BBB     */
   }                                                      /*     A       */
   for(int k=1;k<=min_char;k++)                          
   {
    System.out.print(i);
   } 
   min_char -=2;
   System.out.println();
  }
 }
}