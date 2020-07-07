import java.util.*;

abstract class Shape
{
 float length;
 float breadth;
 int sidea;
 int sideb;
 int sidec;
 int radius;
 int a;
 int b;

final  float PI=3.14f;
Shape(float length,float breadth)
{
this.length=length;
this.breadth=breadth;
}
Shape(int sidea,int sideb,int sidec)
{
this.sidea=sidea;
this.sideb=sideb;
this.sidec=sidec;
}
Shape(int radius)
{
this.radius=radius;
}
Shape(int a,int b)
{
this.a=a;
this.b=b;
}

 abstract float rectangle();
 abstract float triangle();
 abstract float circle();

abstract float eclipse();

}



 class Rectangle extends Shape
{
private float i=1;
Rectangle(float length,float breadth)
{
super(length,breadth);
}
float rectangle()
{
 float ar=(float)length*breadth;
return ar;
}
float triangle()
{
return i;
}
float circle()
{
return i;
}
float eclipse()
{
return i;
}
}
 class Triangle extends Shape
{
private float i=1;
Triangle(int sidea,int sideb,int sidec)
{

super(sidea,sideb,sidec);
}
float triangle()
{

 float sp=(float)((sidea+sideb+sidec)/2.0f);
 float at=(float)Math.sqrt(sp*(sp-sidea)*(sp-sideb)*(sp-sidec));
return at;
}
float circle()
{
return i;
}
float eclipse()
{
return i;
}
float rectangle()
{
return i;
}
}
 class Circle extends Shape
{
private float i=1;
Circle(int radius)
{
super(radius);
}
float circle()
{
float ac=(float)(PI*radius*radius);
return ac;
}
float rectangle()
{
return i;
}
float triangle()
{
return i;
}
float eclipse()
{
return i;
}

}

class Eclipse extends Shape
{
private float i=1;
Eclipse(int a,int b)
{
super(a,b);
}
float eclipse()
{
float ae=PI*a*b;
return ae;
}
float rectangle()
{
return i;
}
float triangle()
{
return i;
}
float circle()
{
return i;
}
}


class Abstract2
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Rectangle     1 "+"\n"+"Trinagle      2"+"\n"+"Circle        3"+"\n"+"Eclipse       4");


boolean bk=true;
while(bk)
{
System.out.println("Enter the Choice To find the Area");
int i=scan.nextInt();
switch(i)
{
case 1:
System.out.println("Enter length and breadth");
float length=scan.nextFloat();
float breadth=scan.nextFloat();
Rectangle arear=new Rectangle(length,breadth);
float ar=arear.rectangle();
System.out.println("Area of Retangle is: "+ar);
break;
case 2:
System.out.println("Enter the side a,side b and side c of Triangle");
int  sidea=scan.nextInt();
int sideb=scan.nextInt();
int sidec=scan.nextInt();
Triangle areat=new Triangle(sidea,sideb,sidec);
float at=areat.triangle();
System.out.println("Area of Triangle is: "+at);
break;
case 3:
System.out.println("Enter the radius of Circle");
int radius=scan.nextInt();
Circle areac=new Circle(radius);
float ac=areac.circle();
System.out.println("Area of Circle is: "+ac);
break;
case 4:
System.out.println("Enter a and b of Eclipse");
int a=scan.nextInt();
int b=scan.nextInt();
Eclipse areae=new Eclipse(a,b);
float ae=areae.eclipse();
System.out.println("Area of Eclipse is: "+ae);
break;
default:
System.out.println("OOPs! Wrong Input,please enter correct Input");
continue;
}
System.out.println("do you want to continue if yes press true else press false");
bk=scan.nextBoolean();
}
}
}

