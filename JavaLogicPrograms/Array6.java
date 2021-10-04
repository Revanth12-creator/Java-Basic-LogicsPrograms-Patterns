import java.util.Scanner;
class Array6
{
 public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
  int sub[]=new int[n];
  int total=0; 
  System.out.println("enter array values");
  for(int i=0;i<n;i++)
  {
  sub[i]=sc.nextInt(); 
  //total=total+sub[i];
  }
  System.out.println(total);
  double per=total/5;
  System.out.println(per);
 }
}





