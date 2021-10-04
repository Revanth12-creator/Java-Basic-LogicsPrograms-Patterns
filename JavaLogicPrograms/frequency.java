class frequency
{
public static void main(String args[])
{
String st="helloworld";
for(char ch='a';ch<='z';ch++)
{
int count=0;
for(int i=0;i<st.length();i++)
{
char ch1=st.charAt(i);
if(ch==ch1)
count++;
}
if(count!=0)
System.out.println(count+"   "+ch);

}
}
}