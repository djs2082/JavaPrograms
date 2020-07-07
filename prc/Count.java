import java.lang.*;
import java.util.*;
public class Check
{
int c=0;
public int find(int n)
{
while(n>0)
{
if(n%2==1)
{
c++;
n=n/2;
}
return c;
}
}
}
class Count
{
public static void main(String s[])
{
int i,j,n,d=0;
int[] a=new int[50];
int[] b=new int[50];
Scanner r=new Scanner(System.in);
n=r.nextInt();
for(i=0;i<n;i++)
{
a[i]=r.nextInt();
}
Check c=new Check();
for(i=0;i<n;i++)
{
b[i]=c.find(a[i]);
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(b[i]>b[j])
d++;
}
}
}
System.out.print(d);
}
}

















