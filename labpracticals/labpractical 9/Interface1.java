import java.util.*;
import java.io.*;
interface addhar
{
String country="India";
void firstname();
void middlename();
void lastname();
void dob();
void gender();
void addharno();
void enrollid();
void show();

}
class Apply implements addhar,Serializable
{
Apply()
{

	System.out.println("");
this.firstname();
System.out.println("");
this.middlename();
System.out.println("");
this.lastname();
System.out.println("");
this.dob();
System.out.println("");
this.gender();
System.out.println("");
this.addharno();
System.out.println("");
this.enrollid();
System.out.println("");
this.show();
}

Scanner scan=new Scanner(System.in);
public String firstname;
public String middlename;
public String lastname;
public String dob;
public String addharno="";
public String enrollid="EN";
public String gender;
public void firstname()
{
System.out.println("Enter first Name");
firstname=scan.next();
}
public void middlename()
{
System.out.println("Enter middle Name");
middlename=scan.next();
}
public void lastname()
{
System.out.println("Enter last Name");
lastname=scan.next();
}
public void dob()
{
System.out.println("Enter Date of Birth in dd/mm/yy format");
dob=scan.next();
}
public void gender()
{
System.out.println("Enter gender");
gender=scan.next();
}
public void addharno()
{
String s="0123456789";
for(int i=0;i<12;i++)
{
if(i==4||i==8||i==12)
addharno=addharno+" ";
addharno=addharno+(s.charAt((int)(Math.random()*10)));
}
}
public void enrollid()
{
String s="0123456789";
for(int i=0;i<8;i++)
{
enrollid=enrollid+(s.charAt((int)(Math.random()*10)));
}
}
public void show()
{System.out.println("Enrollment ID is : "+enrollid);
System.out.println("");
System.out.println("Addhar Created:");
System.out.println("");
System.out.println("Name:                "+firstname+" "+middlename+" "+lastname);
System.out.println("");
System.out.println("DOB:                 "+dob);
System.out.println("");
System.out.println("Gender:              "+gender);
System.out.println("");
System.out.println("country:             "+country);
System.out.println("");
System.out.println("Addhar number is:    "+addharno);

}
}
class Interface1
{
public static void main(String args[]) throws IOException
{
	System.out.println("");
System.out.println("Welcome to AADHAR");
FileOutputStream fos=new FileOutputStream("aadhar.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);

Apply apl1=new Apply();
oos.writeObject(apl1);
Apply apl2=new Apply();
oos.writeObject(apl2);
System.out.println("");
System.out.println("MERA ADDHAR MERI PEHCHAN");
}
}