import java.util.Scanner;
class ch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String st=sc.next();
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<st.length();i++)
{
char ch1=st.charAt(i);
if(ch==ch1)
count++;
}
System.out.println(count);
}
}