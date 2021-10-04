import java.util.Scanner;
class Array7
{
 public static void main(String args[])
 {
  int arr[]=new int[5];
  Scanner sc=new Scanner(System.in);
  System.out.println("original Array");
  System.out.println("enter array values");
  for(int i=0;i<arr.length;i++)
  {
  arr[i]=sc.nextInt();
  }
   System.out.println("-------------");
   System.out.println("after revarsing Array");
   for(int i=4;i>=0;i--)
   {
     System.out.println(arr[i]);
   }
 }
}





