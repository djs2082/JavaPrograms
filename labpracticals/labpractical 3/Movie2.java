import java.util.*;

class Rating 
{

 int a;
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

class Movie2
{
public static void main(String args[])
{
System.out.println("");
System.out.println("");
System.out.println("To stop giving movie rating give rate as 'false' and to terminate program again press 'false' ");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
String ter="false";
float ans;
int sum=0;
int j;


Vector<Integer> v=new Vector<Integer>();

int i=1;
boolean b=true;
Scanner r=new Scanner(System.in);
Rating rt=new Rating();
String movie;
String s;
System.out.println("Enter the Today's Movie Name");

 movie=r.next();
System.out.println("");
System.out.println("");
System.out.println("");

v.add(0);
int re;
while(b)
{
System.out.println("Enter the Movies rating as best,good,average,poor,worst");

s=r.next();
if(s.equals(ter))
{
b=false;
System.out.println("");
System.out.println("");
System.out.println("Today's Movie Rating is over,To get Tomarrow another Movie's Rating press true");
b=r.nextBoolean();
if(b==true)
{
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("Enter the Today's Movie Name");

 movie=r.next();
System.out.println("");
System.out.println("");
System.out.println("");
v=null;
i=1;
sum=0;
ter="false";

v=new Vector<Integer>();
v.add(0);
continue;
}
else
continue;
}
re=rt.Rate(s);

v.add(re);
sum=sum+v.get(i);
ans=(float)(sum/(i*1.0));
System.out.println("");
System.out.println("");
System.out.println(ans);
System.out.println("");


System.out.print("All the Ratings are:  ");

for(j=1;j<v.size();j++)
{
System.out.print(v.get(j)+" ");

}


System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
i++;
}

}

}
