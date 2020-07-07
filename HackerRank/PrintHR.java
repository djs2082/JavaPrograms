import java.util.*;
class PrintHR
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int i;
for(i=1;i<=n;i++)
{

for(int j=1;j<=n-i;j++)

{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("#");
}
System.out.println("");
}
}
}

