import java.util.*;
class RectangleThis3
{
private int length;
private int breadth;
private int area;
int rectangle(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
area=this.area();
return area;
}
int area()
{
area=length*breadth;
return area;
}
}
class AreaThis3
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter length and breadth");
int length=scan.nextInt();
int breadth=scan.nextInt();
RectangleThis3 rec=new RectangleThis3();
int area=rec.rectangle(length,breadth);
System.out.println("Area of Rectangle : "+area);
}
}

