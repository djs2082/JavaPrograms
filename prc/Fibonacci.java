import java.util.*;
class Fibonacci
{
public static void main(String s[])
{
boolean t=true;
int n,a=0,b=1,sum=0,i=0;
Scanner r=new Scanner(System.in);
while(t)
{
System.out.println("Enter the number of terms you want to print of Fibonaccis series");
 n=r.nextInt();
System.out.println(a);
while(i<n-1)
{
sum=a+b;
a=b;
b=sum;
System.out.println(sum);
i++;
}
System.out.println("Do you want to continue,true if yes,else false");
t=r.nextBoolean();
if(t==false)
break;
}
}
}
