class pattern27
{
 public static void main(String args[])
 {
  for(char i='A';i<='E';i++)                      /*      A  */
  {                                               /*     BB  */
   for(char j='E';j>i;j--)                        /*    CCC  */
   {                                              /*   DDDD  */ 
    System.out.print(" ");                        /*  EEEEE  */
   }
   for(char k='A';k<=i;k++)                          
   {                                            
    System.out.print(i);                       
   }   
   System.out.println();
  }
 }
}