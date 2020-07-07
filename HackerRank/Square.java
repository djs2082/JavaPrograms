import java.util.*;
class Square
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int i;
int k=0;
int[] ls=new int[2];
int c=0;
for(i=a;i>0;i--)
{
if(Math.sqrt(i)-(int)Math.sqrt(i)==0)
{
ls[k]=i;

k++;
c++;
}
if(c==2)
break;
}
int p=ls[0]-ls[1];
int sm=ls[0];
c=0;

while(sm<b)
{
p=p+2;
sm=sm+p;
if(sm<=b)
c++;
}
if(Math.sqrt(a)-(int)Math.sqrt(a)==0)
System.out.println(c+1);
else
System.out.println(c);

}


}






















