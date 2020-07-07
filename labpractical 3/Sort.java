import java.util.*;
class Sort
{
public static void main(String args[])
{
int max;
int[] a;
int l;
int j;
int min=0;
boolean b=true;
Scanner r=new Scanner(System.in);




int i;
int t;
while(b)
{
System.out.println("Enter length of  numbers  to sort");
l=r.nextInt();
if(l<0)
{

System.out.println("length of number cannot be negative");
continue;
}
a=new int[l];
System.out.println("Enter the numbers");
for(i=0;i<l;i++)
{
a[i]=r.nextInt();
}

for(i=0;i<l-1;i++)
{
 max=a[i];
for( j=i;j<l;j++)
{
if(a[j]>max)
{
t=max;
max=a[j];
a[j]=t;

}
}

a[i]=max;
}
System.out.println("Numbers in Descnding order are:");
for(i=0;i<l;i++)
{
System.out.print(a[i]+" ");
}
for(i=0;i<l-1;i++)
{
min=a[i];

for(j=i;j<l;j++)
{
if(a[j]<min)
{
t=min;
min=a[j];
a[j]=t;
}
}
a[i]=min;
}
System.out.println("");
System.out.println("Numbers in Ascending order are:");
for(i=0;i<l;i++)
{
System.out.print(a[i]+" ");
}
System.out.println("");
System.out.println("Do you want to continue with Sorting program,if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;

}
}
}


