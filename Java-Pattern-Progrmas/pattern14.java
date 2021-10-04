class pattern14   {
public static void main(String args[])
 {
  for(char i='A';i<='E';i++)                        /*   A      */
  {                                                 /*   AB     */
   for(char j='A';j<=i;j++)                         /*   ABC    */                    
   {                                                /*   ABCD   */ 
    System.out.print(j);                            /*   ABCDE  */
   }
  System.out.println();
  }
 }
}