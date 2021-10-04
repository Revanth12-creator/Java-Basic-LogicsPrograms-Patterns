class pattern46
{
 public static void main(String args[])
 {
  int min_stars=9;
  for(int i=1;i<=5;i++)
  {
   for(int j=0;j<i;j++)                                   /*   *********    */
   {                                                      /*    *******     */
    System.out.print(" ");                                /*     *****      */
   }                                                      /*      ***       */
   for(int k=1;k<=min_stars;k++)                          /*       *        */ 
   {
    System.out.print("*");
   } 
   min_stars -=2;
   System.out.println();
  }
 }
}