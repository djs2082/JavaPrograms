import java.util.*;
class Note
{
private int amt;

void note()
{
while(amt>0)
{
if(amt>1000)
{
System.out.println(amt/1000+" 1000 Rs notes required");
amt=amt%1000;
continue;
}
if(amt>500)
{
System.out.println(amt/500+"  500 Rs notes required");
amt=amt%500;
continue;
}
if(amt>100)
{
System.out.println(amt/100+"  100 Rs notes required");
amt=amt%100;
continue;
}
if(amt>50)
{
System.out.println(amt/50+"   50 Rs notes required");
amt=amt%50;
continue;
}
if(amt>20)
{
System.out.println(amt/20+"   20 Rs notes required");
amt=amt%20;
continue;
}
if(amt>10)
{
System.out.println(amt/10+"   10 Rs notes required");
amt=amt%10;
continue;
}
if(amt>5)
{
System.out.println(amt/5+"    5 Rs coins required");
amt=amt%5;
continue;
}
if(amt>2)
{
System.out.println(amt/2+"    2 Rs coins required");
amt=amt%2;
continue;
}
if(amt>1)
{
System.out.println(amt/1+"    1 Rs coins required");
amt=amt%1;
continue;

}

}
}
}
class NewNote extends Note

{
private int amt;
NewNote(int amt)
{
this.amt=amt;
}
void note()
{
while(amt>0)
{
if(amt>2000)
{
System.out.println(amt/2000+" 2000 Rs notes required");
amt=amt%2000;
continue;
}
if(amt>500)
{
System.out.println(amt/500+"  500 Rs notes required");
amt=amt%500;
continue;
}
if(amt>200)
{
System.out.println(amt/200+"  200 Rs notes required");
amt=amt%100;
continue;
}
if(amt>50)
{
System.out.println(amt/100+"   100 Rs notes required");
amt=amt%100;
continue;
}
if(amt>50)
{
System.out.println(amt/50+"   50 Rs notes required");
amt=amt%50;
continue;
}
if(amt>20)
{
System.out.println(amt/20+"   20 Rs notes required");
amt=amt%20;
continue;
}
if(amt>10)
{
System.out.println(amt/10+"   10 Rs notes required");
amt=amt%10;
continue;
}
if(amt>5)
{
System.out.println(amt/5+"    5 Rs coins required");
amt=amt%5;
continue;
}
if(amt>2)
{
System.out.println(amt/2+"    2 Rs coins required");
amt=amt%2;
continue;
}
if(amt>1)
{
System.out.println(amt/1+"    1 Rs coins required");
amt=amt%1;
continue;

}
}
}

}
class Currency
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
boolean b=true;
int amt;
while(b)
{
System.out.println("Enter amount in Rupees");
amt=r.nextInt();
NewNote n=new NewNote(amt);
n.note();
System.out.println("Do you want to continue if yes press true else press false");
b=r.nextBoolean();
}
}
}
