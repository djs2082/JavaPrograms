import java.util.*;

abstract class Shape
{
int length;
int breadth;
Shape(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
}
abstract int area();
}
class Area extends Shape
{
Area(int length,int breadth)
{
super(length,breadth);
}
int area()
{
int ar=length*breadth;
return ar;
}
}
class Abstract1
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter length and breadth");
int length=scan.nextInt();
int breadth=scan.nextInt();
Area area=new Area(length,breadth);
int ar=area.area();
System.out.println("Area of Retangle is: "+ar);
}
}

