class pattern48
{
 public static void main(String args[])
 {
  int min_numbers=9;
  for(int i=5;i>=1;i--)
  {                                                       /* 999999999  */
   for(int j=5;j>i;j--)                                   /*  7777777    */
   {                                                      /*   55555     */
    System.out.print(" ");                                /*    333     */
   }                                                      /*     1       */
   for(int k=1;k<=min_numbers;k++)                          
   {
    System.out.print(min_numbers);
   } 
   min_numbers -=2;
   System.out.println();
  }
 }
}