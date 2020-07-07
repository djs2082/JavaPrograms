import java.util.*;
class StringReverse
{
public static void main(String args[])
{
String s;
char[] c;
int i;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the String");
s=r.next();
int l=s.length();
c=new char[l];
for(i=0;i<l;i++)
{
c[i]=s.charAt(i);
}
for(i=l-1;i>=0;i--)
{
System.out.print(c[i]);

}
System.out.println("");
System.out.println("Do you want to continue with String reverse Program,if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}
