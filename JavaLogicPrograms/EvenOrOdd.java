import java.util.Scanner;
class EvenOrOdd
{
 public static void main (String args[])
 {
  int x;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any Number ");
  x=sc.nextInt();
  if(x%2==0)
  {
   System.out.print(x +" is Even Number");
  }
  else
  {
   System.out.print(x+ "is Odd Number");
  }
 }
}