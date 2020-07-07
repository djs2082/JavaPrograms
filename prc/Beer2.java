public class Beer2
{
public static void main(String s[])
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