import java.util.*;
class LogicalOperators
{
public static void main(String arg
s[])
{
boolean a,c;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{

System.out.println("Enter the logical values of p and q two perform logical operartions");
a=r.nextBoolean();
c=r.nextBoolean();
System.out.println("AND operation is "+(a&&c));
System.out.println("OR  operation is "+(a||c));
System.out.println("Not on p and q respectively is "+(!a)+" "+(!c));
System.out.println("NAND operation is "+!(a&&c));
System.out.println("NOR operation is "+!(a||c));

System.out.println("Do you want to continue if yes,then true else false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}
