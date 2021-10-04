class pattern32
{
 public static void main(String args[])
 {
  for(char i='E';i>='A';i--)                      /*  EEEEE*/
  {                                               /*   DDDD  */
   for(char j='E';j>i;j--)                        /*    CCC  */
   {                                              /*     BB  */ 
    System.out.print(" ");                        /*      A  */
   }
   for(char k='A';k<=i;k++)                          
   {                                            
    System.out.print(i);                       
   }   
   System.out.println();
  }
 }
}