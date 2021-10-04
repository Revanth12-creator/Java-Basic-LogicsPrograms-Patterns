class PrimeSeries 
{
 public static void main(String args[])
 { 
  int size=10;
  int fromNum=1,count=0;
  while(fromNum<=size)
  {
   for(int i=1;i<=fromNum;i++)
   {
    if(fromNum%i==0)
    {
     count++;
    }
   }
    if(count==2)
    {
     System.out.println(fromNum);
    }
    count=0;
    fromNum++;
  }
 }
}
