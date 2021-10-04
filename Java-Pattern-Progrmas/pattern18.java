class pattern18
{
public static void main(String args[])
 {
  for(char i='A';i<='E';i++)                        /*   AAAAA  */
  {                                                 /*   BBBB   */
   for(char j='E';j>=i;j--)                         /*   CCC    */                    
   {                                                /*   DD     */ 
    System.out.print(i);                            /*   E      */
   }
  System.out.println();
  }
 }
}