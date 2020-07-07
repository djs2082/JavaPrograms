import java.util.*;
class Area2
{
int lt;
int bt;
int r;
int s;
int a;
int b;
int c;
Area2()
{
 lt=15;
 bt=10; 
r=5;
 s=20;
 a=5;
 b=6;
 c=7;
}

double[] ar=new double[4];
double[] area()
{
ar[0]=lt*bt;
ar[1]=s*s;
ar[2]=3.14*r*r;
double sp=(a+b+c)/2.0;
ar[3]=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
return ar;
}
}
class Npc
{
public static void main(String args[])
{
Area2 r=new Area2();
double[] a=r.area();
System.out.println("Area of Rectangle is: "+a[0]);
System.out.println("Area of Square is:    "+a[1]);
System.out.println("Area of Circle is:    "+a[2]);
System.out.println("Area of Triangle is:  "+a[3]);
}
}


