import java.util.*;
class Grade
{
public static void main(String args[])
{
boolean b=true;
int mrk;
Scanner r=new Scanner(System.in);
while(b)
{
System.out.println("Enter the Marks of Student");
mrk=r.nextInt();


switch(mrk)
{
case 10:
System.out.println("Grade is A+");
break;
case 9:
System.out.println("Grade is A");
break;
case 8:
System.out.println("Grade is B+");
break;
case 7:
System.out.println("Grade is B");
break;
case 6:
System.out.println("Grade is C+");
break;
case 5:
System.out.println("Grade is C");
break ;
case 4:
System.out.println("Grade is F");
break;
case 3:
System.out.println("Grade is F");
break;
case 2:
System.out.println("Grade is F");
break;
case 1:
System.out.println("Grade is F");
break;
 default:
System.out.println("Wrong Input,please enter the marks less than 10 and greater than 0");
continue;

}
System.out.println("Do you want to continue,if yes then true else false");
b=r.nextBoolean();
if(b==false)
break;
}
}
}

