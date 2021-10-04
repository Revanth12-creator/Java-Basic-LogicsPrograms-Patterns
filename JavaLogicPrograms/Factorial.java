import java.util.Scanner;
class Factorial
{
 public static void main(String args[])
 {
  int x;
  int fact=1;
  System.out.println("please enter factorial number");
  Scanner sc=new Scanner(System.in);
  x=sc.nextInt();
  for(int i=1;i<=x;i++)
  {
  fact=fact*i;
  }
  System.out.println(fact);
 }
}