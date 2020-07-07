import java.util.*;
class Print
{
static String college="SGGS";

static String branch="CSE";
private String name;
private String regno;
private float cgpa;
static int i=1;
Print(String name,String regno,float cgpa)
{
this.name=name;
this.regno=regno;
this.cgpa=cgpa;
}
void prints()
{
System.out.print("("+i+")"+"     "+name);        
System.out.print("       "+regno+"          "+cgpa+"    "+branch+"      "+college);
System.out.println("");
i++;
}
}


class StaticVariable2
{
public static void main(String args[])
{
String name;
String regno;
float cgpa;
int j=0;
Print st[]=new Print[50];
Scanner r = new Scanner(System.in);
boolean b=true;

System.out.println("Enter the  student name,regno,cgpa ");
while(b)
{


name=r.next();
regno=r.next();
cgpa=r.nextFloat();


 st[j]=new Print(name,regno,cgpa);

System.out.println("To Enter another students details press true and continue,or to create list press false");
b=r.nextBoolean();
if(b==false)
{int l=j;
System.out.println("sr.no   Name         Registeration no.   cgpa   Branch   College   ");
System.out.println("");
for(j=0;j<=l;j++)
{

st[j].prints();
}
}

j++;
}



}
}

