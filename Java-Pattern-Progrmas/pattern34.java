class pattern34
{
 public static void main(String args[])
 {
  int p_length=5;
  int min_starts=1;
  int P_space=p_length-1;                              /*       *         */
  for(int i=0;i<p_length;i++)                          /*      ***        */ 
  {                                                    /*     *****       */
   for(int j=P_space;j>i;j--)                          /*    *******      */
   {                                                   /* 	   *********     */
    System.out.print(" ");
   }
    for(int k=0;k<min_starts;k++)
   {
    System.out.print("*");
   }
  min_starts +=2;
  System.out.println();
  }
 }
}