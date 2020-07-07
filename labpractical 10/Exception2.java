import java.util.*;
/* using try multiplecach and finally*/
class ArithmeticExceptionHour extends Exception{}
class ArithmeticExceptionMinute extends Exception{}
class ArithmeticExceptionSeconds extends Exception{}
class Exception2
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
String s="";
boolean bk=true;
while(bk)
{
System.out.println("Enter 12 hour time in hh:mm:sspm format");
s=r.next();
try
{

    if(Integer.parseInt(s.substring(0,2))>12)
	throw new ArithmeticExceptionHour();
	if(Integer.parseInt(s.substring(3,5))>60)
	throw new ArithmeticExceptionMinute();
	if(Integer.parseInt(s.substring(6,8))>60)
	throw new ArithmeticExceptionSeconds();

}
catch(ArithmeticExceptionHour aeh)
{
System.out.println(aeh);
	System.out.println("plz enter  valid hour on 12 hour watch(exception handled)");
	continue;
}
catch(ArithmeticExceptionMinute aem)
{
System.out.println(aem);
System.out.println("please enter valid minutes(exception handled)");
continue;
}
catch(ArithmeticExceptionSeconds aes)
{
System.out.println(aes);
System.out.println("please enter valid seconds(exception handled)");
continue;
}
bk=false;

}
finally
{
	System.out.println("Thankyou fou using my program");
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