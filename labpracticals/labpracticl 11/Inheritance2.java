import java.util.*;
class PasswordInheritance2
{
protected String email;
protected String pass="";
PasswordInheritance2(String firstname,String lastname)
{
email=firstname+"."+lastname+"@"+"sggs.ac.in";
String s="ABCDEFGHIJKLMNOPQRSTUVWXYabcdefghijklmnopqrstuvwxyz123457890!@#$%";
for(int i=0;i<8;i++)
{
pass=pass + s.charAt((int)(Math.random()*s.length()));


}
System.out.println("Your Email is : "+email);
System.out.println("Your Password is : "+pass);
}


}
class CreateemailPass extends PasswordInheritance2
{
CreateemailPass(String firstname,String lastname)
{
super(firstname,lastname);
}
}
class Inheritance2
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