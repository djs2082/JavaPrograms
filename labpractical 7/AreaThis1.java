import java.util.*;
class Rectangle 
{
private int length;
private int breadth;
private int area;
Rectangle(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
}
int rectangle()
{
area=length*breadth;
return area;
}
}
class AreaThis1
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int length;
int breadth;
int area;
System.out.println("Enter length and breadth of Rectangle");
length=scan.nextInt();
breadth=scan.nextInt();
Rectangle rec=new Rectangle(length,breadth);
area=rec.rectangle();
System.out.println("Area is: "+area);
}
}
