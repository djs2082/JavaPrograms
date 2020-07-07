import java.util.*;
class EvenorOdd
{
public static void main(String s[])
{
int n;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the number you want to check");
n=r.nextInt();
if(n%2==0)
System.out.println("Number is Even");
else
System.out.println("Number is Odd");
System.out.println("Do you want to continue if yes,then true else false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}
