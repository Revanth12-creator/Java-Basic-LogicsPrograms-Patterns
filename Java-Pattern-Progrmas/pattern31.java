class pattern31
{
 public static void main(String args[])
 {
  for(int i=5;i>=1;i--)                           /*  12345  */
  {                                               /*   1234  */
   for(int j=5;j>i;j--)                           /*    123  */
   {                                              /*     12  */ 
    System.out.print(" ");                        /*      1  */
   }
   for(int k=1;k<=i;k++)                          
   {                                            
    System.out.print(k);                       
   }   
   System.out.println();
  }
 }
}