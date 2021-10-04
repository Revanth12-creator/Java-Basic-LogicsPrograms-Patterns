import java.util.*;
class ArraySorting
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size");
  int n=sc.nextInt();
  int arr[]=new int[n];
  int temp;
  System.out.println("before sorting");
  System.out.println("enter array values");
  for(int i=0;i<n;i++)
  {
  arr[i]=sc.nextInt(); 
  }
  System.out.println("after sorting");
 
  for(int i=0;i<arr.length-1;i++)
  {
  	for(int j=0;j<=i;j++){
	if(arr[j]>arr[j+1]) 
  	{
 	 temp=arr[j];
  	arr[j]=arr[j+1];
  	arr[j+1]=temp;
  	}
	}
  }
for(int i=0;i<n;i++)
  {
  System.out.println(arr[i]); 
  }
  }
}





