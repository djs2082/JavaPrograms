import java.util.*;

class TempFromCelToFarad
{
void tempfromceltofarad()
{
float tc,tf;
boolean t=true;
Scanner r=new Scanner(System.in);
while(t)
{
System.out.println("Enter the Temperature in Degree Celsius");
tc=r.nextFloat();
tf=((tc*9)/5)+32;
System.out.println("Temperature in Farad is "+tf);
System.out.println("Do you wish to continue with Temperatrure conversion program,press true if yes,else false");
t=r.nextBoolean();
if(t==false)
break;
}
}
}



class StringReverse
{
void stringreverse()
{
String s;
char[] c;
int i;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the String");
s=r.next();
int l=s.length();
c=new char[l];
for(i=0;i<l;i++)
{
c[i]=s.charAt(i);
}
for(i=l-1;i>=0;i--)
{
System.out.print(c[i]);

}
System.out.println("");
System.out.println("Do you want to continue with String reverse Program,if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}




class Prints
{
static String college="SGGS";

static String branch="CSE";
private String name;
private String regno;
private float cgpa;
static int i=1;
Prints(String name,String regno,float cgpa)
{
this.name=name;
this.regno=regno;
this.cgpa=cgpa;
}
void prints()
{
System.out.print("("+i+")"+"     "+name);        
System.out.print("       "+regno+"          "+cgpa+"    "+branch+"      "+college);
System.out.println("");
i++;
}
}


class StaticVariable
{
void staticvariable()
{
String name;
String regno;
float cgpa;
int j=0;
Prints st[]=new Prints[50];
Scanner r = new Scanner(System.in);
boolean b=true;

System.out.println("Enter the  student name,regno,cgpa ");
while(b)
{


name=r.next();
regno=r.next();
cgpa=r.nextFloat();


 st[j]=new Prints(name,regno,cgpa);

System.out.println("To Enter another students details press true and continue,or to create list press false");
b=r.nextBoolean();
if(b==false)
{int l=j;
System.out.println("sr.no   Name         Registeration no.   cgpa   Branch   College   ");
System.out.println("");
for(j=0;j<=l;j++)
{

st[j].prints();
}
}

j++;
}



}
}






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

class StaticMethod
{
void staticmethod()
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




class Sort
{
void sort()
{
int max;
int[] a;
int l;
int j;
int min=0;
boolean b=true;
Scanner r=new Scanner(System.in);

System.out.println("Enter length of  numbers  to sort");
l=r.nextInt();

a=new int[l];
int i;
int t;
while(b)
{
System.out.println("Enter the numbers");
for(i=0;i<l;i++)
{
a[i]=r.nextInt();
}

for(i=0;i<l-1;i++)
{
 max=a[i];
for( j=i;j<l;j++)
{
if(a[j]>max)
{
t=max;
max=a[j];
a[j]=t;

}
}

a[i]=max;
}
System.out.println("Numbers in Descnding order are:");
for(i=0;i<l;i++)
{
System.out.print(a[i]+" ");
}
for(i=0;i<l-1;i++)
{
min=a[i];

for(j=i;j<l;j++)
{
if(a[j]<min)
{
t=min;
min=a[j];
a[j]=t;
}
}
a[i]=min;
}
System.out.println("");
System.out.println("Numbers in Ascending order are:");
for(i=0;i<l;i++)
{
System.out.print(a[i]+" ");
}
System.out.println("");
System.out.println("Do you want to continue with Sorting program,if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;
else
{
a=null;
System.out.println("Enter the length of numbers to sort");
l=r.nextInt();
a=new int[l];
} 
}
}
}



class PrimePrint
{
void primeprint()
{
Scanner r=new Scanner(System.in);
boolean b=true,k=false;
int n,i=3,j;
while(b)
{
System.out.println("Enter number of prime numbers you want to print");

n=r.nextInt();
System.out.println("2");

while( i<=n)
{
for( j=2;j<i;j++)
{
if(i%j==0)
{
k=true;
break;
}
}

if(k==false)
{
System.out.println(i);


}
k=false;
i++;
}
System.out.println("Do you wish to continue with Prime number program,if yes press true,else false");
b=r.nextBoolean();
if(b==false)
break;
else
i=3;



}
}
}


class Area1
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

Area1(float l,float b)
{
this.l=l;
this.b=b;
}
Area1(int s)
{
this.s=s;
}
Area1(float r)
{
this.r=r;
}
Area1(float a,float b,float c)
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
area=4*s;
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
void paraconstructer()
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
Area1 t;
Scanner r=new Scanner(System.in);
while(B)
{
System.out.println("Rectangle     1");
System.out.println("Square        2");
System.out.println("Circle        3");
System.out.println("Triangle      4");
System.out.println("");
System.out.println("");

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
t=new Area1(l,b);
area=t.rectangle();
System.out.println("");

System.out.println("Area of Rectangle is :"+area);
break;
case 2:
System.out.println("Enter the side of Square");
System.out.println("");
s=r.nextInt();
t=new Area1(s);
area=t.square();
System.out.println("");

System.out.println("Area of Square is :"+area);
break;
case 3:
System.out.println("Enter the radius of Circle");
System.out.println("");
rd=r.nextFloat();

t=new Area1(rd);
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


t=new Area1(a,b,c);
area=t.triangle();
System.out.println("");

System.out.println("Area of Triangle is :"+area);
break;

default:
System.out.println("");
System.out.println("Wrong Inputs");
break;
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




class Area8
{
int lt;
int bt;
int r;
int s;
int a;
int b;
int c;
Area8()
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
ar[1]=4*s;
ar[2]=3.14*r*r;
double sp=(a+b+c)/2.0;
ar[3]=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
return ar;
}
}
class Npc
{
void npara()
{
Area8 r=new Area8();
double[] a=r.area();
System.out.println("Area of Rectangle is: "+a[0]);
System.out.println("Area of Square is:    "+a[1]);
System.out.println("Area of Circle is:    "+a[2]);
System.out.println("Area of Triangle is:  "+a[3]);

}
}





class Bank
{
double getRateOfInterest(int p,int t)
{
double r=9.00;
double interest=(p*t*r)/100;
return interest;
}
}
class SBI extends Bank
{
double getRateOfInterest(int p,int t)
{
double r=9.95;
double interest=(p*t*r)/100;
return interest;
}
}
class ICICI extends Bank
{
double r=9.98;
double getRateofInterest(int p,int t)
{
double interest=(p*t*r)/100;
return interest;
}
}
class Axis extends Bank
{
double getRateofInterest(int p,int t)
{
double r=10.25;
double interest=(p*t*r)/100;
return interest;
}
}

class MethodOverriding
{
void methodoverriding()
{
int i;
boolean b=true;
int p;
int t;
double interest;
Scanner r=new Scanner(System.in);

while(b)
{

System.out.println("SBI               1");
System.out.println("ICICI             2");
System.out.println("Axis              3");
System.out.println("National Average  4");
System.out.println("");
System.out.println("");
System.out.println("Enter the Amount in Rupees and Time period in years");
p=r.nextInt();
t=r.nextInt();
System.out.println("");
System.out.println("");
System.out.println("Enter the choice of your Bank");
System.out.println("");
i=r.nextInt();
switch(i)
{

case 1:
SBI sbi=new SBI();
interest=sbi.getRateOfInterest(p,t);
System.out.println("");
System.out.println("Interest is: "+interest);
break;
 case 2:
ICICI icici=new ICICI();
interest=icici.getRateOfInterest(p,t);
System.out.println("");
System.out.println("Interest is: "+interest);
break;
case 3:
Axis axis=new Axis();
interest=axis.getRateOfInterest(p,t);
System.out.println("");
System.out.println("Interest is: "+interest);
break;
case 4:
Bank bank=new Bank();
interest=bank.getRateOfInterest(p,t);
System.out.println("");
System.out.println("Interest is: "+interest);
break;
default:
System.out.println("");
System.out.println("Wrong Input");

}
System.out.println("");
System.out.println("");
System.out.println("Do you want to continue with given program,if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;

}
}
}



class Area
{
final float PI=3.145f;
private float area;
private float sp;
float area(int s)
{ area=s*s;
return area;
}
float area(float l,float b)
{
area=l*b;
return area;
}
float area(float r)
{
area=PI*r*r;
return area;
}
float area(float a,float b,float c)
{
sp=(a+b+c)/2;
area=(float)Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
return area;
}
}

class MethodOverloading
{
void methodoverloading()
{
float a,b,c,area;
int n;
int ra,i;
boolean ch=true;
Area ob[]=new Area[4];
Scanner r=new Scanner(System.in);
System.out.println("Square    1");
System.out.println("Rectange  2");
System.out.println("Square    3");
System.out.println("Triangle  4");
bk:
{
while(ch)
{
System.out.println("Enter the choice");
i=r.nextInt();
switch(i)
{
case 1:
System.out.println("Enter the side of Square");
n=r.nextInt();
ob[0]=new Area();
area=ob[0].area(n);
System.out.println("Area of Square is: "+area);
break;
case 2:
System.out.println("Enter the length and breadth of Rectangle");
a=r.nextFloat();
b=r.nextFloat();
 ob[1]=new Area();
area=ob[1].area(a,b);
System.out.println("Area of Rectangle is: "+area);
break;
case 3:
System.out.println("Enter the radius of Circle");
a=r.nextFloat();
 ob[2]=new Area();
area=ob[2].area(a);
System.out.println("Area of Circle is: "+area);
break;
case 4:
System.out.println("Enter the sides of Triangle");
a=r.nextFloat();
b=r.nextFloat();
c=r.nextFloat();
 ob[3]=new Area();
area=ob[3].area(a,b,c);
System.out.println("Area of Triangle is: "+area);
break;
default:
System.out.println("Wrong Input");
break bk;
}
System.out.println("Do you want to continue if yes press true else press false");
ch=r.nextBoolean();
if(ch==false)
break;
}
}
}
}


class LogicalOperators
{
void logicaloperators()
{
boolean a,c;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{

System.out.println("Enter the p and q two perform logical operartions");
a=r.nextBoolean();
c=r.nextBoolean();
System.out.println("AND operation is "+(a&&c));
System.out.println("OR  operation is "+(a||c));
System.out.println("Not on p and q respectively is "+(!a)+" "+(!c));
System.out.println("NAND operation is "+!(a&&c));
System.out.println("NOR operation is "+!(a||c));

System.out.println("Do you want to continue with Logical Operators program if yes,then press true else false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}




class HelloWorld
{
void helloworld()
{
System.out.println("Hello World");
}
}


class Grade
{
void grade()
{
boolean b=true;
int mrk;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the Marks of Student");
mrk=r.nextInt();

switch(mrk)
{
case 10:
System.out.println("Grade is A+");
break;
case 9:
System.out.println("Grade is A");
break;
case 8:
System.out.println("Grade is B+");
break;
case 7:
System.out.println("Grade is B");
break;
case 6:
System.out.println("Grade is C+");
break;
case 5:
System.out.println("Grade is C");
break ;
case 4:
System.out.println("Grade is F");
break;
 default:
System.out.println("Wrong Input");
break;
}
System.out.println("Do you want to continue with Grade program,if yes then press true else false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}



class Fibonacci
{
void fibonacci()
{
boolean t=true;
int n,a=0,b=1,sum=0,i=0;
Scanner r=new Scanner(System.in);
while(t)
{
System.out.println("Enter the number of terms you want to print of Fibonaccis series");
 n=r.nextInt();
System.out.println(a);
while(i<n-1)
{
sum=a+b;
a=b;
b=sum;
System.out.println(sum);
i++;
}
System.out.println("Do you want to continue with Fibonacci series, press true if yes,else false");
t=r.nextBoolean();
if(t==false)
break;
}
}
}



class Factorial
{
void factorial()
{
Scanner r=new Scanner(System.in);
boolean b=true;
int n,fact=1;
while(b)
{
System.out.println("Enter the number to find the Factorial");
n=r.nextInt();
while(n>0)
{
fact=fact*n;
n=n-1;
}
System.out.println("Factorial is "+fact);
System.out.println("Do you want to continue with Factorial program,if yes then true,else false");
b=r.nextBoolean();
if(b==false)
break;
else
fact=1; 
}
}
}





class EvenorOdd
{
void even()
{
int n;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the number you want to check");
n=r.nextInt();
if(n%2==0)
System.out.println("Number is Even");
else
System.out.println("Number is Odd");
System.out.println("Do you want to continue with Even Odd program, if yes,then true else false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}





class Area3
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

Area3(float l,float b)
{
this.l=l;
this.b=b;
}
Area3(int s)
{
this.s=s;
}
Area3(float r)
{
this.r=r;
}
Area3(float a,float b,float c)
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
area=4*s;
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
class ConstructurOverloading
{
void constructuroverloading()
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
Area3 t;
Scanner r=new Scanner(System.in);

System.out.println("Rectangle     1");
System.out.println("Square        2");
System.out.println("Circle        3");
System.out.println("Triangle      4");
System.out.println("");
System.out.println("");


while(B)
bk:
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
t=new Area3(l,b);
area=t.rectangle();
System.out.println("");

System.out.println("Area of Rectangle is :"+area);
break;
case 2:
System.out.println("Enter the side of Square");
System.out.println("");
s=r.nextInt();
t=new Area3(s);
area=t.square();
System.out.println("");

System.out.println("Area of Square is :"+area);
break;
case 3:
System.out.println("Enter the radius of Circle");
System.out.println("");
rd=r.nextFloat();

t=new Area3(rd);
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


t=new Area3(a,b,c);
area=t.triangle();
System.out.println("");

System.out.println("Area of Triangle is :"+area);
break;

default:
System.out.println("");
System.out.println("Wrong Inputs");
break bk;
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






class Case6
{
void case6(int p)
{
bk6:
{





switch(p)

{

case 1:
ConstructurOverloading co=new ConstructurOverloading();
co.constructuroverloading();
break;
case 2:
MethodOverloading mol=new MethodOverloading();
mol.methodoverloading();
break;
case 3:
MethodOverriding mr=new MethodOverriding();
mr.methodoverriding();
break;

default:
System.out.println("Wrong Input");
break bk6;

}


}
}

}



class Concat
{
void concat()
{
String s1;
String s2;
boolean b=true;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the first String");
s1=r.next();
System.out.println("Enter the second String");
s2=r.next();
s2=s1.concat(s2);
System.out.println("Concated String is: "+s2);
System.out.println("Do you want to continue with String concatation program if yes press true else press false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}



class Case4
{
void case4(int p)
{
bk4:
{





switch(p)

{

case 1:

ParaConstructer pc=new ParaConstructer();
pc.paraconstructer();
break;
case 2:
Npc npc=new Npc();
npc.npara();
break;

default:
System.out.println("Wrong Input");
break bk4;

}

}

}
}


class Case5
{
void case5(int p)
{
bk5:
{





switch(p)

{

case 1:
StaticMethod sm=new StaticMethod();
sm.staticmethod();
break;
case 2:
StaticVariable sv=new StaticVariable();
sv.staticvariable();
break;

default:
System.out.println("Wrong Input");
break bk5;

}

}
}
}




class Case3
{
void case3(int p)
{
bk3:
{


switch(p)
{
case 1:
Sort s=new Sort();
s.sort();
break;
case 2:
StringReverse sr=new StringReverse();
sr.stringreverse();
break;
case 3:
Concat ct=new Concat();
ct.concat();
break;
default:
System.out.println("Wrong Input");
break bk3;
}
}
}
}



class Case2
{
void case2(int p)
{
bk2:
{

                                                                 


switch(p)
{
case 1:
EvenorOdd u=new EvenorOdd();
u.even();
break;
case 2:
Factorial v=new Factorial();
v.factorial();
break;
case 3:

Grade w=new Grade();
w.grade();
break;
case 4:

LogicalOperators x=new LogicalOperators();
x.logicaloperators();
break;

case 5:
BitOperator sc=new BitOperator();
sc.bit();
break;
default:
System.out.println("Wrong Input");
break bk2;
}
}
}
}


class Case1
{

void case1(int p)
{
bk1:
{






switch(p)

{

case 1:
HelloWorld q=new HelloWorld();
q.helloworld();
break;
case 2:
ArithmeticOperations sc=new ArithmeticOperations();
sc.arithmetic();
break;
case 3:
Fibonacci z=new Fibonacci();
z.fibonacci();
break;
case 4:
TempFromCelToFarad s=new TempFromCelToFarad();
s.tempfromceltofarad();
break;

case 5:
PrimePrint t=new PrimePrint();
t.primeprint();
break;
default:
System.out.println("Wrong Input");
break bk1;

}



}
}
}


class BitOperator
{
void bit()
{
int a,c;
Scanner r=new Scanner(System.in);
boolean b=true;
while(b)
{
System.out.println("Enter a and b");
a=r.nextInt();
c=r.nextInt();
System.out.println("Enter the two numbers to perform bitwise operation");
System.out.println("Bitwise AND is "+(a&c));
System.out.println("Bitwise OR is "+(a|c));
System.out.println("Bitwise Exclusive OR is"+(a^c));
System.out.println("Bitwise shift is "+(a<<2)+" "+(a>>2)+" "+(a>>>2));
System.out.println("Do you want to continue with Bitwise operation,if yes then true else false");
b=r.nextBoolean();

}
}
}



class ArithmeticOperations
{
void arithmetic()
{
Scanner r=new Scanner(System.in);
System.out.println("Enter the Two Numbers to perform Arithmetic Operations");
float a,b,c;
a=r.nextFloat();
b=r.nextFloat();
boolean t=true;
while(t)
{
System.out.println("");
System.out.println("");
System.out.println("Addition       1");
System.out.println("Substraction   2");
System.out.println("Multiplication 3");
System.out.println("Division       4");
System.out.println("Mod            5");
System.out.println("");
System.out.println("");
int i=r.nextInt();


switch(i)
{
case 1:
c=a+b;
System.out.println("Summation is "+c);
break;
case 2:
c=a-b;
System.out.println("Substraction is "+c);
break;
case 3:
c=a*b;
System.out.println("Multiplication is "+c);
break;
case 4:
c=a/b;
System.out.println("Division is "+c);
break;
case 5:
c=a%b;
System.out.println("Mod is "+c);
break;
default:
System.out.println("Wrong Input");
break;
}
System.out.println("Do you want to contnue with Arithmetic Operations,true if yes,else false");
t=r.nextBoolean();
if(t==false)
break;
}
}
}








class Print
{
void print()
{
System.out.println("Practical 1         1");
System.out.println("");

System.out.println("    .Hello World              1");
System.out.println("    .Arithmetic operations    2");
System.out.println("    .Fibonacci series         3");
System.out.println("    .Temperature conversion   4");
System.out.println("    .Print Prime Numbers      5");
System.out.println("");
System.out.println("");
System.out.println("Practical 2         2");
System.out.println("");
System.out.println("    .Even or Odd              1");
System.out.println("    .Factorial                2");
System.out.println("    .Calculate Grade          3");
System.out.println("    .Logical Operator         4");
System.out.println("    .Bitwise Operator         5");
System.out.println("");
System.out.println("");
System.out.println("Practical 3         3");
System.out.println("");
System.out.println("    .Sorting                  1");
System.out.println("    .StringReverse            2");
System.out.println("    .Concat                   3");
System.out.println("");
System.out.println("");
System.out.println("Practical 4         4");
System.out.println("");
System.out.println("    .Para. Constructor        1");
System.out.println("    .Nonpara. Constructor     2");
System.out.println("");
System.out.println("");
System.out.println("Practical 5         5");
System.out.println("");
System.out.println("    .Static Method            1");
System.out.println("    .Static Variable          1");
System.out.println("");
System.out.println("");
System.out.println("Practical 6         6");
System.out.println("");
System.out.println("    .Method Overloading       1");
System.out.println("    .Construct.Overloading    2");
System.out.println("    .MethodOverriding         3");
System.out.println("");
System.out.println("");
}
}



class Projectcmb2
{
public static void main(String args[])
{

Scanner r;
r=new Scanner(System.in);
Print pr=new Print();
pr.print();
int p;
boolean b=true;
int i;
while(b)
bk:
{

System.out.println("Enter the Practical number");
i=r.nextInt();


switch(i)

{

case 1:
{
System.out.println("Enter the program's number");
p=r.nextInt();
Case1 c1=new Case1();
c1.case1(p);
break;
}




case 2:
{
System.out.println("Enter the program's number");
p=r.nextInt();
Case2 c2=new Case2();
c2.case2(p);
break;
}


case 3:
{
System.out.println("Enter the program's number");
p=r.nextInt();
Case3 c3=new Case3();
c3.case3(p);
break;
}


case 4:
{
System.out.println("Enter the program's number");
p=r.nextInt();
Case4 c4=new Case4();
c4.case4(p);
break;
}


case 5:

{

System.out.println("Enter the program's number");
p=r.nextInt();


Case5 c5=new Case5();
c5.case5(p);
break;
}



case 6:
{
System.out.println("Enter thr program's number");
p=r.nextInt();
Case6 c6=new Case6();
c6.case6(p);
break;
}


default:
System.out.println("Wrong Input");
break bk;
}
System.out.println("Do you want to continue,if yes press true else press false");
b=r.nextBoolean();
}
}

}




 