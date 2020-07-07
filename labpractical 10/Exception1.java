import java.util.*;
/* handle exception8*/
class Exception1
{
public static void main(String args[])throws ArithmeticException
{
Scanner r=new Scanner(System.in);
String s="";
s=r.next();
try
{

if(Integer.parseInt(s.substring(0,2))>12)
	throw new ArithmeticException();

}
catch(ArithmeticException e)
{
	System.out.println("plz enter 12 hr watch(exception handled)");
	return;
}

char ch=s.charAt(8);
StringBuffer sb=new StringBuffer(s);
//System.out.println(sb+" "+ch);
sb.delete(8,10);
if(ch=='A' || ch=='a')
{
String s2=sb.substring(0,2);
if(s2.equals("12"))
{
sb.replace(0,2,"00");
System.out.println(sb);
}
else
{int t1=Integer.parseInt(s2)+12;
sb.replace(0,2,Integer.toString(t1));
System.out.println(sb);
}
}


if(ch=='P'|| ch=='p')
{
String s2=sb.substring(0,2);
if(s2.equals("12"));
System.out.println(sb);
if(s2.equals("12")==false)
{
	int t=Integer.parseInt(s2)+12;
sb.replace(0,2,Integer.toString(t));
System.out.println(sb);
}
}
}
}