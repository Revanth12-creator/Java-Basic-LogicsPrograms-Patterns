class pattern28
{
 public static void main(String args[])
 {
  for(char i='A';i<='E';i++)                      /*      A  */
  {                                               /*     AB  */
   for(char j='E';j>i;j--)                        /*    ABC  */
   {                                              /*   ABCD  */ 
    System.out.print(" ");                        /*  ABCDE  */
   }
   for(char k='A';k<=i;k++)                          
   {                                            
    System.out.print(k);                       
   }   
   System.out.println();
  }
 }
}