import java.util.*;
/*
using throw keyeword
*/
class Exception5
{
public static void main(String args[]) throws Exception
{
Scanner r=new Scanner(System.in);
String s="";
boolean bk=true;
while(bk)
{
System.out.println("Enter 12 hour time in hh:mm:sspm format");
s=r.next();

    if(Integer.parseInt(s.substring(0,2))>12)
	{
	throw new ArithmeticExceptionHour("please enter valid hours");
	
	}
	
	
	if(Integer.parseInt(s.substring(3,5))>60)
	{
		throw new ArithmeticExceptionMinute("please enter valid minutes");
	    
	}
	

	if(Integer.parseInt(s.substring(6,8))>60)
	{
    throw new ArithmeticExceptionSeconds("please enter valid seconds");
    
	}







bk=false;

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

if(s2.equals("12")==false)
{
	int t=Integer.parseInt(s2)+12;
sb.replace(0,2,Integer.toString(t));
System.out.println(sb);
}
}
}
}