class pattern8 {
public static void main(String args[])
 {
  for(char i='E';i>='A';i--)                   /*   EEEEE   */
  {                                            /*   DDDDD   */
   for(char j='A';j<='E';j++)                  /*   CCCCC   */                    
   {                                           /*   BBBBB  */ 
    System.out.print(i);                       /*   AAAAA   */
   }
  System.out.println();
  }
 }
}