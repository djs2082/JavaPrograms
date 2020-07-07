
/*  

Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

*/






















import java.util.*;
class TimeConversion
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
String s=r.next();
char ch=s.charAt(8);
StringBuffer sb=new StringBuffer(s);
System.out.println(sb+" "+ch);
sb.delete(8,10);
if(ch=='A')
{
String s2=sb.substring(0,2);
if(s2.equals("12"))
{
sb.replace(0,2,"00");
System.out.println(sb);
}
else
{
System.out.println(sb);
}
}


if(ch=='P')
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