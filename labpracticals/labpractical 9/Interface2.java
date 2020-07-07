import java.util.*;
interface Publicdata
{
void firstname();
void middlename();
void lastname();
void dob();
void gender();
}
interface Officialdata
{
void addharno();
void enrollid();
void show();
String country="India";
}
class Apply2 implements Publicdata,Officialdata
{
Apply2()
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
{
	System.out.println("====================================");
	System.out.println("Enrollment ID is : "+enrollid);
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
System.out.println("===================================");
}
}
class Interface2
{
public static void main(String args[])
{
	System.out.println("");
System.out.println("Welcome to AADHAR");
Apply2 apl=new Apply2();
System.out.println("");
System.out.println("=================================");
System.out.println("MERA ADDHAR MERI PEHCHAN");
System.out.println("=================================");
}
}


