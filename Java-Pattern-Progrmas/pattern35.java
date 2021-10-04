class pattern35
{
 public static void main(String args[])
 {
 int min_lenght=5;
 int min_nubers=1;
 int min_space=min_lenght-1;                             /*       1         */
  for(int i=1;i<=min_lenght;i++)                         /*      222        */
  {                                                      /*     33333       */
   for(int j=min_space;j>i;j--)                          /*    4444444      */
   {                                                     /*   555555555     */
   System.out.print(" ");
   }
   for(int k=1;k<=min_nubers;k++)
   {
   System.out.print(i);
   }
  min_nubers +=2;
  System.out.println();
  }
 }
}