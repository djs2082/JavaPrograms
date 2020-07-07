import java.util.*;
class PasswordInheritance3
{
protected String pass="";
PasswordInheritance3()
{
String s="ABCDEFGHIJKLMNOPQRSTUVWXYabcdefghijklmnopqrstuvwxyz123457890!@#$%";
for(int i=0;i<8;i++)
{
pass=pass + s.charAt((int)(Math.random()*s.length()));


}
}
}

class EmailInheritance3 extends PasswordInheritance3
{

protected String email;
EmailInheritance3(String firstname,String lastname)
{
super();
email=firstname+"."+lastname+"@"+"sggs.ac.in";

System.out.println("Your Email is : "+email);
System.out.println("Your Password is : "+super.pass);
}


}
class CreateemailPass extends EmailInheritance3
{
CreateemailPass(String firstname,String lastname)
{
super(firstname,lastname);
}
}
class Inheritance3
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first Name");
String firstname=scan.next();
System.out.println("Enter last Name");
String lastname=scan.next();
CreateemailPass cep=new CreateemailPass(firstname,lastname);
}
}