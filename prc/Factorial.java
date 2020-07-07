import java.util.*;
class Factorial
{
public static void main(String s[])
{
Scanner r=new Scanner(System.in);
boolean b=true;
int n,fact=1;
while(b)
{
System.out.println("Enter the number to find the Factorial");
n=r.nextInt();
while(n>0)
{
fact=fact*n;
n=n-1;
}
System.out.println("Factorial is "+fact);
System.out.println("Do you want to continue,if yes then true,else false");
b=r.nextBoolean();
if(b==false)
break;
else
fact=1; 
}
}
}

