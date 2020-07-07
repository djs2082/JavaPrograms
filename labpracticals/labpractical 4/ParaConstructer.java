import java.util.*;
class Area
{
float l;
float b;
int s;
float r;
float a;
float c;
float ar;
double area;

float sp;

Area(float l,float b)
{
this.l=l;
this.b=b;
}
Area(int s)
{
this.s=s;
}
Area(float r)
{
this.r=r;
}
Area(float a,float b,float c)
{
this.a=a;
this.b=b;
this.c=c;
}
double rectangle()
{
area=l*b;
return area;
}
double square()
{
area=s*s;
return area;
}
double circle()
{
area=3.14f*r*r;
return area;
}
double triangle()
{

System.out.println(a+b+c);
sp=(a+b+c)/2.0f;

ar=sp*(sp-a)*(sp-b)*(sp-c);
System.out.println(sp);
if(ar<0)
ar=-ar;

area=Math.sqrt(ar);
return area;
}
}
class ParaConstructer
{
public static void main(String args[])
{
boolean B=true;

int i;
float l;
float b;
double area;
int s;
float rd;
float a;
float c;
Area t;
Scanner r=new Scanner(System.in);

System.out.println("Rectangle     1");
System.out.println("Square        2");
System.out.println("Circle        3");
System.out.println("Triangle      4");
System.out.println("");
System.out.println("");
while(B)
{
System.out.println("Enter frome the above choice to find the Area");
System.out.println("");
i=r.nextInt();
System.out.println("");
System.out.println("");
switch(i)
{
case 1:
System.out.println("Enter the length and breadth of Rectangle");
System.out.println("");
l=r.nextFloat();
b=r.nextFloat();
t=new Area(l,b);
area=t.rectangle();
System.out.println("");

System.out.println("Area of Rectangle is :"+area);
break;
case 2:
System.out.println("Enter the side of Square");
System.out.println("");
s=r.nextInt();
t=new Area(s);
area=t.square();
System.out.println("");

System.out.println("Area of Square is :"+area);
break;
case 3:
System.out.println("Enter the radius of Circle");
System.out.println("");
rd=r.nextFloat();

t=new Area(rd);
area=t.circle();
System.out.println("");

System.out.println("Area of Circle is :"+area);
break;
case 4:

System.out.println("Enter the sides of Triangle");
System.out.println("");
a=r.nextFloat();
b=r.nextFloat();
c=r.nextFloat();


t=new Area(a,b,c);
area=t.triangle();
System.out.println("");

System.out.println("Area of Triangle is :"+area);
break;

default:
System.out.println("");
System.out.println("Wrong Inputs");
continue;
}
System.out.println("");
System.out.println("");
System.out.println("Do you want to continue with Area program if yes press true else press false");
System.out.println("");

B=r.nextBoolean();
System.out.println("");
System.out.println("");
if(B==false)
{
break;

}
}
}
}

