import java.util.*;
class PasswordInheritance1
{
protected String email;
protected String pass="";
protected String email(String firstname,String lastname)
{
String s=firstname+"."+lastname+"@"+"sggs.ac.in";
return s;
}


protected String password()
{
String s="ABCDEFGHIJKLMNOPQRSTUVWXYabcdefghijklmnopqrstuvwxyz123457890!@#$%";
for(int i=0;i<8;i++)
{
pass=pass + s.charAt((int)(Math.random()*s.length()));


}
return pass;
}
}
class CreateemailPass extends PasswordInheritance1
{
CreateemailPass(String firstname,String lastname)
{
super.email=super.email(firstname,lastname);
super.pass=super.password();
System.out.println("Your email is : "+super.email);
System.out.println("Your password is : "+super.pass);
}
}
class Inheritance1
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