import java.util.*;
class MaxMinHR
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int i,j,k,l;
long[] arr =new long[5];
long sum;
for(i=0;i<5;i++)
{
arr[i]=r.nextLong();
}
long max=arr[0]+arr[1]+arr[2]+arr[3];
long min=arr[0]+arr[1]+arr[2]+arr[3];
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
for(k=j+1;k<5;k++)
{
for(l=k+1;l<5;l++)
{
sum=arr[i]+arr[j]+arr[k]+arr[l];
if(sum>=max)
max=sum;
else if(sum<=min)
min=sum;


}
}
}
}

System.out.println(max+" "+min);
}
}
