class CamelCaseProgram
{
 public static void main(String args[])
 {
  String a="WelComeRevanthKumar";
  char ch[]=a.toCharArray();
  int count=0;
  for(int i=0;i<=ch.length-1;i++)
  {
   if(ch[i]>='A' && ch[i]<='Z')
   {
    count++;
   }
  }
  System.out.print(count);
 }
}