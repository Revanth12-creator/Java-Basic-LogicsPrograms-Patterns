class pattern36
{
 public static void main(String args[])
 {
 int min_lenght=5;
 int min_nubers=1;
 int min_space=min_lenght-1;
  for(int i=1;i<=min_lenght;i++)                        /*       1         */
  {                                                     /*      123        */
   for(int j=min_space;j>i;j--)                         /*     12345       */
   {                                                    /*    1234567      */
   System.out.print(" ");                               /*   123456789     */ 
   }
   for(int k=1;k<=min_nubers;k++)
   {
   System.out.print(k);
   }
  min_nubers +=2;
  System.out.println();
  }
 }
}