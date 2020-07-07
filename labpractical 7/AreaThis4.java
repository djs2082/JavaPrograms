import java.util.*;
class RectangleThis4
{
private int length;
private int breadth;
private int area;
void area(RectangleThis4 rec)
{
rec.area=rec.length*rec.breadth;
System.out.println("Area is :"+area);
}
void rectangle(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
area(this);
}
}
class AreaThis4
{
public static void main(String args[])
{
System.out.println("Enter length and breadth");
Scanner scan=new Scanner(System.in);
int length=scan.nextInt();
int breadth=scan.nextInt();
RectangleThis4 rec=new RectangleThis4();
rec.rectangle(length,breadth);
}
}
