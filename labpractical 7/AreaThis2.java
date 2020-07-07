import java.util.*;
class RectangleThis2
{
private int length;
private int breadth;
private int area;
RectangleThis2(int length,int breadth)
{
this(length,breadth,1);
System.out.println("Area is : "+area);
}
RectangleThis2(int length,int breadth,int l)
{
this.length=length;
this.breadth=breadth;
area=length*breadth;
}




}
class AreaThis2
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int length;
int breadth;
System.out.println("Enter length and breadth");
length=scan.nextInt();
breadth=scan.nextInt();

RectangleThis2 rec=new RectangleThis2(length,breadth);
}
}
