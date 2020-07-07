import java.util.*;
class Areas
{
private int length;
private int breadth;
private int radius;
private int side;
private int sidea;
private int sideb;
private int sidec;
private int semiperi;
private int area;
private final float PI=3.144f;
Areas(int length,int breadth,int radius,int side,int sidea,int sideb,int sidec)
{
this.length=length;
this.breadth=breadth;
this.radius=radius;
this.side=side;
this.sidea=sidea;
this.sideb=sideb;
this.sidec=sidec;

int arearectangle=this.rectangle();
int areacircle=this.circle();
int areasquare=this.square();
int areatriangle=this.triangle();
System.out.println("Area of Rectangle is: "+arearectangle);
System.out.println("Area of Circle is   : "+areacircle);
System.out.println("Area of Square is   : "+areasquare);
System.out.println("Area of Triangle is : "+areatriangle);


}
private int rectangle()
{
area=length*breadth;
return area;
}
private int circle()
{
area=(int)PI*radius*radius;
return area;
}
private int square()
{
area=side*side;
return area;
}
private int triangle()
{
semiperi=(int)(sidea+sideb+sidec)/2;
area=(int)(Math.sqrt(semiperi*(semiperi-sidea)*(semiperi-sideb)*(semiperi-sidec)));
return area;
}
}
class AreasUsingThis
{
public static void main(String args[])

{
Scanner scan=new Scanner(System.in);
System.out.println("Enter length and breadth of Rectangle");
int length=scan.nextInt();
int breadth=scan.nextInt();
System.out.println("Enter radius of Circle");
int radius=scan.nextInt();
System.out.println("Enter side of Square");
int side=scan.nextInt();
System.out.println("Enter sides of Triangle");
int sidea=scan.nextInt();
int sideb=scan.nextInt();
int sidec=scan.nextInt();

Areas ar=new Areas(length,breadth,radius,side,sidea,sideb,sidec);
}
}
