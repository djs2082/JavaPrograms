import java.util.*;

class Rating 
{
private int a;
int Rate(String s)
{
String s1="best";
String s2="good";
String s3="average";
String s4="poor";
String s5="worst";
if(s.equals(s1))
{a=5;

}
if(s.equals(s2))
a=4;
if(s.equals(s3))
a=3;
if(s.equals(s4))
a=2;

if(s.equals(s5))
a=1;
return a;
}

}

class Movie
{
public static void main(String args[])
{
String ter="false";
float ans;
int sum=0;
int j;
boolean see=false;
Vector<Integer> v=new Vector<Integer>();
int i=1;
boolean b=true;
Scanner r=new Scanner(System.in);
Rating rt=new Rating();
String movie;
String s;
System.out.println("Enter the Today's Movie Name");
System.out.println("");
String movie=r.next();
System.out.println("");
System.out.println("");
System.out.println("");

v.add(0);
int re;
while(b)
{Vector<Integer> v=new Vector<Integer>();
System.out.println("Enter the Movies rating as best,good,average,poor,worst");
System.out.println("");
s=r.next();
if(s.equals(ter))
{
b=false;
System.out.println("");
System.out.println("");
System.out.println("Today's Movie Rating is over,To get Tomarrow another Movie's Rating press true");
b=r.next();
if(b==true)
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("Enter the Today's Movie Name");
System.out.println("");
 movie=r.next();
v=null;
i=1;
sum=0;
ter=false;
see=false;
Vector<Integer> v=new Vector<Integer>();
continue;
}
re=rt.Rate(s);
System.out.println(v.size()+"in");
v.add(re);
System.out.println(v.size());
sum=sum+v.get(1);
ans=(float)(sum/(i*1.0));
System.out.println("");
System.out.println("");
System.out.println(ans);
System.out.println("To see all the Ratings press true,else press false");
System.out.println("");
see=r.nextBoolean();
if(see==true)
{
for(j=1;j<v.size();j++)
{
System.out.print(v.get(j)+" ");

}
System.out.println("");
see=false;
}
System.out.println("");
System.out.println("");
i++;
}

}

}
