import java.util.*;
class Socks
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int[] arr=new int[n];
int i;
int j;
int c=0;
for(i=0;i<n;i++)
arr[i]=r.nextInt();
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]==-5)

break;
if(arr[i]==arr[j])
{
System.out.println(arr[i]+" "+i+" "+j);
arr[i]=-5;
arr[j]=-5;
c++;
}
}

}
System.out.println(c);
}
}
