import java.util.*;
class BitOperator
{
public static void main(String s[])
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
System.out.println("Do you want to continue,if yes then true else false");
b=r.nextBoolean();

}
}
}