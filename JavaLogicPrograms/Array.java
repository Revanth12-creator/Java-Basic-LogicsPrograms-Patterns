import java.util.*;
class Array
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("enter array element");
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=sc.nextInt();
  }
  System.out.println("------------------");
  for(int i=4;i>=0;i--)
  {
    System.out.println(arr[i]);
  }
 }
}





