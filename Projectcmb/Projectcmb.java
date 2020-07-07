import java.util.*;

class Matrix
{
void matrix()
{
Scanner r=new Scanner(System.in);
System.out.println("Enter the number of rows and columns of Two Matrix");
int rw=r.nextInt();
int cl=r.nextInt();
boolean b=true;
while(b)
{
int[][] m1=new int[rw][cl];
int[][] m2=new int[rw][cl];
int[][] m3=new int[rw][cl];


System.out.println("Enter the elements of first Matrix");
for(int i=0;i<rw;i++)
{
for(int j=0;j<cl;j++)
{
m1[i][j]=r.nextInt();
}
}

System.out.println("Enter the elements of second Matrix");

for(int i=0;i<rw;i++)
{
for(int j=0;j<cl;j++)
{
m2[i][j]=r.nextInt();
}
}
System.out.println("Addition of two matrices is:");
for(int i=0;i<rw;i++)
{
for(int j=0;j<cl;j++)
{
m3[i][j]=m1[i][j]+m2[i][j];
System.out.print(m3[i][j]+" ");

}
System.out.println("");
}
System.out.println("Do you want to continue with Matrix addittion Program,if yes press true else press false");
b=r.nextBoolean();
}

}
}

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
 class Beer2
{
void beer2()
{
int bt=99;
String name="bottles";
while(bt>0)
{
if(bt==1)
name="bottle";
System.out.println(bt+" "+name+" of beer on the wall");
System.out.println(bt+" "+name+" of beer");
System.out.println("Take one down");
System.out.println("Pass it around");
bt=bt-1;
}
}
}



class Projectcmb
{
public static void main(String args[])
{

Scanner r;
r=new Scanner(System.in);
System.out.println("Practical 1          1");
System.out.println("");

System.out.println("    .Hello World              1");
System.out.println("    .Arithmetic operations    2");
System.out.println("    .Fibonacci series         3");
System.out.println("    .Temperature conversion   4");
System.out.println("    .Print Prime Numbers      5");
System.out.println("");
System.out.println("");
System.out.println("Practical 2          2");

System.out.println("    .Even or Odd              1");
System.out.println("    .Factorial                2");
System.out.println("    .Calculate Grade          3");
System.out.println("    .Logical Operator         4");
System.out.println("    .Bitwise Operator         5");
System.out.println("");
System.out.println("");
System.out.println("Other Programs       3");
System.out.println("");
System.out.println("    .Bottles song             1");
System.out.println("    .Matrix Addition          2");
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
bk1:
{

System.out.println("Enter the program's number");
p=r.nextInt();




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


break;
}
case 2:
bk2:
{

                                                                 
System.out.println("Enter the program's number");
p=r.nextInt();

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
break;
}
case 3:
bk3:
{
System.out.println("Enter the program's number");
p=r.nextInt();

switch(p)
{
case 1:
Beer2 u=new Beer2();
u.beer2();
break;
case 2:
Matrix c=new Matrix();
c.matrix();
break;
default:
System.out.println("Wrong Input");
break bk3;
}
}
break;
default:
System.out.println("Wrong Input was");
break bk;
}
System.out.println("Do you want to continue,if yes press true else press false");
b=r.nextBoolean();
}
}

}




 