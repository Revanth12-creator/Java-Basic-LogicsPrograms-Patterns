class pattern30
{
 public static void main(String args[])
 {
  for(int i=5;i>=1;i--)                           /*  55555  */
  {                                               /*   4444  */
   for(int j=5;j>i;j--)                           /*    333  */
   {                                              /*     22  */ 
    System.out.print(" ");                        /*      1  */
   }
   for(int k=1;k<=i;k++)                          
   {                                            
    System.out.print(i);                       
   }   
   System.out.println();
  }
 }
}