import java.util.*;
class Division
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int k=r.nextInt();
int[] arr=new int[n];
int i;
int j;
int c=0;
for(i=0;i<n;i++)
{
arr[i]=r.nextInt();
}
for(i=0;i<n-1;i++)
{
for(j=i;j<n;j++)
{
if((i<j) && (arr[i]+arr[j])%k==0)
c++;
}
}
System.out.println(c);
}
} 