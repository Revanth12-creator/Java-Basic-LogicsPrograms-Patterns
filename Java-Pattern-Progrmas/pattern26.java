class pattern26
{
 public static void main(String args[])
 {
  for(int i=1;i<=5;i++)                           /*      1  */
  {                                               /*     12  */
   for(int j=5;j>i;j--)                           /*    123  */
   {                                              /*   1234  */ 
    System.out.print(" ");                        /*  12345  */
   }
   for(int k=1;k<=i;k++)                          
    {                                            
     System.out.print(k);                       
    }   
   System.out.println();
  }
 }
}