import java.util.*;
class Birds
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int i;
int j;
int n=r.nextInt();
int[] ar1=new int[n];
int[] ar2=new int[n];
for(i=0;i<n;i++)
{
ar1[i]=r.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(ar1[j]==-1)
continue;
if(ar1[i]==ar1[j])
{
ar2[i]++;
ar1[j]=-1;
}
}
}
int k=0;
int max=ar2[0];
for(i=0;i<n;i++)
{
if(ar2[i]>max)
max=ar2[i];
}
for(i=0;i<n;i++)
{
if(ar2[i]==max)
{
k=i;
break;
}
}
System.out.println(ar1[k]);
}
}