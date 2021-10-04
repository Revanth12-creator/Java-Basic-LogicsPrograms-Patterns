import java.util.*;
class SerchArray1
{ 
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size");
  int count=0;
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("enter array values");
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  System.out.println("enter serching values");
  int search=sc.nextInt();
  for(int i=0;i<n;i++)
  {
    if(arr[i]==search)
    {
    count++;
    }
  }
  if(count>=1)
  System.out.println(search+"serching value avaialble in array= ");
  else
  System.out.println(search+"not serching value avaialble in array");
 }
}