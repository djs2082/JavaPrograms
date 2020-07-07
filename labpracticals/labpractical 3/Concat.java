
import java.util.*;
class Concat
{
public static void main(String args[])
{
String s1;
String s2;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the first String");
s1=r.next();
System.out.println("Enter the second String");
s2=r.next();
s2=s1.concat(s2);
System.out.println("Concated String is: "+s2);
System.out.println("Do you want to continue with String concatation program if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}