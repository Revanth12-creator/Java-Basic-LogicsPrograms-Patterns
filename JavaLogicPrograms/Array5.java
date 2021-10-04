import java.util.Scanner;
class Array5
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
  int arr[];
  arr=new int[5];
  System.out.println("enter Array Values");
  for(int i=0;i<5;i++)
  {
   System.out.print("values of array ["+i+"]-");
    arr[i]=sc.nextInt();
  }
 }
}





