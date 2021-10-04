class Array3
{
 public static void main(String args[])
 {
  int arr[];
  int i=0;
  int k=0;
  arr=new int[5];
  arr[0]=10;
  arr[1]=20;
  arr[2]=30;
  arr[3]=40;
  arr[4]=50;
  while(i<arr.length)
  {
  System.out.println(arr[i]);
  i++;
  }
  System.out.println("--------------");
  for(int j=0;j<arr.length;j++)
  {
  System.out.println(arr[j]);
  }
  System.out.println("--------------");
  do
  {
  System.out.println(arr[k]);
  k++;
  }
  while(k<arr.length);
 }
}





