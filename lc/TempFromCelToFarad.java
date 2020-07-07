
import java.util.*;
class TempFromCelToFarad
{
public static void main(String s[])
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
System.out.println("Do you wish to continue,true if yes,else false");
t=r.nextBoolean();
if(t==false)
break;
}
}
}