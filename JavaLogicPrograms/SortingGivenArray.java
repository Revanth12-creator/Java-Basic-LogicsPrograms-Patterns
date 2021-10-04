import java.util.*;
class SortingGivenArray
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("befor sorting");
  System.out.println("enter array elemets");
  int temp;
  for(int i=0;i<n;i++) 
  {
   arr[i]=sc.nextInt();
  }
  System.out.println("after sorting");
  for(int i=0;i<arr.length-1;i++)
  {
    if(arr[i]>=arr[i+1])
    {
     temp=arr[i];
     arr[i]=arr[i+1];
     arr[i+1]=temp; 
    }
   System.out.println(arr[i]);
  }
 }
}





