import java.util.*;
class Year
{
public static void main(String args[])
{
int fb=28;
Scanner r=new Scanner(System.in);
int year=r.nextInt();
int sum;
int dd;
if(year<1918)
{
if(year%4==0)
fb=29;
sum=31+fb+31+30+31+30+31+31;

dd=256-sum;
if(dd<9)
{
System.out.println("0"+dd+".09."+year);
else
System.out.println(dd+".09."+year);
}
else if(year>1918)
{
if(year%400==0 || (year%4==0 && year%100!=0))
fb=29;
sum=31+fb+31+30+31+30+31+31;
System.out.println(sum+" ");
dd=256-sum;
System.out.println(sum+" "+dd);
if(dd<9)
System.out.println("0"+dd+".09."+year);
else
System.out.println(dd+".09."+year);
}

else
{
System.out.println("26.09."+year);
}
}
}


