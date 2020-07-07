import java.util.*;
class JavaStringIntroduction
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
String a=r.next();
String b=r.next();
System.out.println(a.length()+b.length());
int bt=a.compareTo(b);
if(bt==0)
System.out.println("Yes");
else
System.out.println("No");

String st1=a.toUpperCase();
a=a.substring(1,a.length());
char ch1=st1.charAt(0);
String st2=b.toUpperCase();
b=b.substring(1,b.length());
char ch2=st2.charAt(0);

System.out.println(ch1+a.toLowerCase()+" "+ch2+b.toLowerCase());
}
}