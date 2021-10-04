class pattern23
{
public static void main(String args[])
 {
  for(char i='A'; i<='E'; i++)                      /*   EDCBA  */
  {                                                 /*   EDCB   */
   for(char j='E'; j>=i; j--)                       /*   EDC    */                    
   {                                                /*   ED     */ 
    System.out.print(j);                            /*   E      */
   }
  System.out.println();
  }
 }
}