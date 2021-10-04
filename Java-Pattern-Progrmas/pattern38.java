class pattern38
{
 public static void main(String args[])
 {
  char min_letters='A';
  for(char i='A';i<='E';i++)
  {
   for(char j='D';j>=i;j--)
   {
    System.out.print(" ");
   }
   for(char k='A';k<=min_letters;k++)
   {
    System.out.print(i);
   }
   min_letters +=2;
   System.out.println();
  }
 }
}