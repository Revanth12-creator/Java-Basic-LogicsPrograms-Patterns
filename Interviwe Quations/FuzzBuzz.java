import java.io.*;
class FuzzBuzz
{
 public static void main(String args[])
 {
  int n=100;
  for(int i=1;i<=n;i++){
   if(i%3==0){
    System.out.println("Fuzz");
   } else if(i%5==0){
    System.out.println("Buzz");
   } else {
    System.out.println(i);
   }
  }
 }
}