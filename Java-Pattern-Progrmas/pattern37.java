class pattern37
{
 public static void main(String args[])
 {
 int p_lenght=5;
 int min_numbers=1;
  for(int i=1;i<=p_lenght;i++)                        /*       1         */
  {                                                   /*      333        */
   for(int j=5;j>i;j--)                               /*     55555       */
   {                                                  /*    7777777      */
   System.out.print(" ");                             /*   999999999     */
   }
   for(int k=1;k<=min_numbers;k++)
   {
   System.out.print(min_numbers);
   }
  min_numbers +=2;
  System.out.println();
  }
 }
}