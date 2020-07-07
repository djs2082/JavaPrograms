import java.util.*;
class ArithmeticOperations
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
System.out.println("Enter the Two Numbers to perform Arithmetic Operations");
float a,b,c;
a=r.nextFloat();
b=r.nextFloat();
boolean t=true;

System.out.println("");
System.out.println("");
System.out.println("Addition       1");
System.out.println("Substraction   2");
System.out.println("Multiplication 3");
System.out.println("Division       4");
System.out.println("Mod            5");
System.out.println("");
System.out.println("");

while(t)
{
System.out.println("Enter your choice");
int i=r.nextInt();
switch(i)
{
case 1:
c=a+b;
System.out.println("Summation is "+c);
break;
case 2:
c=a-b;
System.out.println("Substraction is "+c);
break;
case 3:
c=a*b;
System.out.println("Multiplication is "+c);
break;
case 4:
c=a/b;
System.out.println("Division is "+c);
break;
case 5:
c=a%b;
System.out.println("Mod is "+c);
break;
default:
System.out.println("Wrong Input");
continue;

}
System.out.println("Do you want to continue,true if yes,else false");
t=r.nextBoolean();
if(t==false)
break;
}
}
}
