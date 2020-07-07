import java.util.*;
class CandleHR
{
public static void main(String args[])
{
int i;
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int[] arr=new int[n];
for(i=0;i<n;i++)
{
arr[i]=r.nextInt();
}
int max=arr[0];
for(i=0;i<n;i++)
{
if(arr[i]>max)
max=arr[i];
}
int c=0;
for(i=0;i<n;i++)
{
if(arr[i]==max)
c++;
}

System.out.println(c);
}
}