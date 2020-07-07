import java.lang.*;
import java.util.*;
class Sums
{
Scanner r=new Scanner(System.in);

int sum(int a)
{
Scanner r1=new Scanner(System.in);
int d=r1.nextInt();
int e=a+d;
return e;
}
}
class Subs
{
int sub(int a)
{

Scanner r2=new Scanner(System.in);
int d=r2.nextInt();
int e=a-d;
return e;
}
}


class Calcii
{
public static void main(String s[])
{

int k;
boolean x=true;

Scanner r=new Scanner(System.in);
int a=r.nextInt();

 back:while(x)
{
Scanner r3=new Scanner(System.in);
char c=r3.next().charAt(0);
System.out.println(a+'c');
switch(c)
{
case '+':
{
Scanner r4 = new Scanner(System.in);
int ans=r4.nextInt();
Sums t=new Sums();
 k=t.sum(a);
System.out.println(k);
a=k;
break back;
}
case '-':
{
Scanner r5=new Scanner(System.in);
k=r5.nextInt();
Subs t=new Subs();
k=t.sub(a);
System.out.println(a);
a=k;
break back;
}
}
}
}
}