import java.util.*;
class Test
{
int fact(int n,int d)
{
if(n==1)
return 1;
int m=n-d+1;
return m;
}
}
class Birthday
{
public static void main(String args[])
{
int i;
int ct=0;
int sum=0;
int n;
int m;
int d;
int k;
Scanner r=new Scanner(System.in);
n=r.nextInt();
int[] b=new int[n];
for(i=0;i<n;i++)
{
b[i]=r.nextInt();
}

d=r.nextInt();
m=r.nextInt();

int[] c=new int[m];
Test t=new Test();
int lt=t.fact(n,m);
System.out.println("lt="+lt);
int j=0;
i=0;

while(j<lt)
{
for(k=0;k<m;k++)
{
c[k]=b[i];
sum=sum+c[k];
System.out.println("i="+i+" "+"j="+j+"k="+k);
i++;

}

if(sum==d)
ct++;
sum=0;
i=i-(k-1);
j++;
}
System.out.println(ct);
}
}










