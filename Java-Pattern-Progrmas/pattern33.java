class pattern33
{
 public static void main(String args[])
 {
  for(char i='E';i>='A';i--)                      /*  ABCDE  */
  {                                               /*   ABCD  */
   for(char j='E';j>i;j--)                        /*    ABC  */
   {                                              /*     AB  */ 
    System.out.print(" ");                        /*      A  */
   }
   for(char k='A';k<=i;k++)                          
   {                                            
    System.out.print(k);                       
   }   
   System.out.println();
  }
 }
}