class AmstrongNumber
{
 public static void main(String args[])
 {
 int num=370,r ,number;
 int total=0;
 number=num;
 while(num>0)
 {
  r=num%10;
  total=total+r*r*r;
  num=num/10;
 }
 if(total==number)
   System.out.println(number+ "is the ArmStrong");
  else
  System.out.println(number+ "is the not ArmStrong");
 }
}





