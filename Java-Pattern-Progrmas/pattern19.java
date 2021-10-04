class pattern19
{
public static void main(String args[])
 {
  for(char i='E';i>='A';i--)                        /*   ABCDE  */
  {                                                 /*   ABCD  */
   for(char j='A';j<=i;j++)                         /*   ABC   */                    
   {                                                /*   AB    */ 
    System.out.print(j);                            /*   A     */
   }
  System.out.println();
  }
 }
}