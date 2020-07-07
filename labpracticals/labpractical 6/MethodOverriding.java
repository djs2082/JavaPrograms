import java.util.*;
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
public static void main(String args[])
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
continue;
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
