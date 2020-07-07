import java.util.*;
class Book
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);

int fp;
int lp;
int n=r.nextInt();
int p=r.nextInt();
if(p%2==0)
fp=p/2;
else
fp=(p-1)/2;

if((n-p)%2==0)
lp=(n-p)/2;
else
lp=(n-p-1)/2;

if(lp>=fp)
System.out.println(fp);
else 
System.out.println(lp);
}
}