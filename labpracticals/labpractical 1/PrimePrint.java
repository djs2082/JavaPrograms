import java.lang.*;
import java.util.*;

class PrimePrint
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
boolean b=true,k=false;
int n,i=3,j;
while(b)
{
System.out.println("Enter the  number upto which you want to print prime numbers ");

n=r.nextInt();

if(n<0)
{
System.out.println("Wrong input");
continue;
}
if(n==0)
continue;
System.out.println("2");
while( i<=n)
{
for( j=2;j<i;j++)
{
if(i%j==0)
{
k=true;
break;
}
}

if(k==false)
{
System.out.println(i);


}
k=false;
i++;
}
System.out.println("Do you wish to continue,if yes true,else false");
b=r.nextBoolean();
if(b==false)
break;
else
i=3;



}
}
}
