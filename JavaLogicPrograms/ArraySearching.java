
import java.util.*;
class ArraySearching
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size");
  int n=sc.nextInt();
  int arr[]=new int[n];
  int count=0;
  System.out.println("enter array values");
  for(int i=0;i<n;i++)
  {
  arr[i]=sc.nextInt();
  }
  System.out.println("Enter the searching value");
  int ele=sc.nextInt();
  for(int i=0;i<n;i++)
  {
   if(arr[i]==ele)
   {
   count++;
   }
  }
  if(count>=1)
  System.out.println("yes count= "+count);
  else
  System.out.println("no");
 }
}





