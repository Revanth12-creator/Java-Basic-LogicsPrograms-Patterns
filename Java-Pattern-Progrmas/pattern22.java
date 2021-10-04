class pattern22
{
public static void main(String args[])
 {
  for(char i='E'; i>='A'; i--)                      /*   EEEEE  */
  {                                                 /*   DDDD   */
   for(char j='A'; j<=i; j++)                       /*   CCC    */                    
   {                                                /*   BB     */ 
    System.out.print(i);                            /*   A      */
   }
  System.out.println();
  }
 }
}