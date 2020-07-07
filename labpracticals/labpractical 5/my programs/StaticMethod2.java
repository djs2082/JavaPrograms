import java.util.*;
class PowerSeries
{
static int a=1;
static int b=1;
static int c=0;
static void squareSeries(int am)
{
a=am*a;
System.out.print(a+" ");
}
static void multiSeries(int am,int rm)
{
if(c==0)
{
b=am;
c++;
}

b=b*rm;


System.out.print(b+" ");


}
}

class StaticMethod2
{
public static void main(String args[])
{
int ts;
int i=1;
int am;
int tgp;
int a,ra;
Scanner r=new Scanner(System.in);
boolean b=true;
while(b)
{
System.out.println("Enter number of terms to print for square series");
ts=r.nextInt();
System.out.println("");


System.out.println("Enter the first term of the series");

am=r.nextInt();
System.out.println("");
System.out.println("");
while(i<=ts)
{
PowerSeries.squareSeries(am);
i++;
}
i=1;
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("Enter number of terms to print for GP series");
tgp=r.nextInt();
System.out.println("");
System.out.println("Enter the first term and common multiple for GP");
a=r.nextInt();
ra=r.nextInt();
System.out.println("");
System.out.println("");
System.out.print(a+" ");
while(i<tgp)
{

PowerSeries.multiSeries(a,ra);
i++;
}
System.out.println("");
System.out.println("");

System.out.println("Do you want to continue with following program if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;
System.out.println("");
System.out.println("");
System.out.println("");
}
}

}