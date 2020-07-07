import java.io.*;
import java.util.*;

class SGGSStudents
{
public static void main(String args[]) throws IOException
{
String year="";
String ck=" ";
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
Vector<String> searches=new Vector<String>();
Vector<String> searchednames=new Vector<String>();
String foundname;
int choice;
String end="this is last line";
String branch="";
Scanner r=new Scanner(System.in);
String filestring;
String[] token;
boolean b=true;
int c=0;
String name="";
String gender;
while(b)//to run program repeatedly
{
	BufferedReader br1=new BufferedReader(new FileReader("sggs.txt"));//read file
System.out.println("Enter students FirstName or MiddleName or LastName");
try
{
name=br2.readLine();//read name from user
if(name.equals(""))
{
throw new Exception();
}
}
catch(Exception e)
{
	System.out.println("Invalid Name");
	continue;
}


StringTokenizer st=new StringTokenizer(name);//to reduce name to one word if it contains 
                                             //more than one word
name=st.nextToken();
System.out.println("Enter students Gender");
try
{
gender=br2.readLine();
gender=gender.toUpperCase();
if((gender.equals("MALE") || gender.equals("FEMALE"))==false)//to catch input other than male and female
throw new Exception();	
}
catch(Exception e)
{
	System.out.println("Invalid Gender");
	continue;
}

gender=gender.substring(0,1);//to get first letter of input gender
System.out.println("");
name=name.toUpperCase();
do
{
filestring=br1.readLine();//read line from file
c++;
filestring=filestring.trim();
if(filestring.charAt(0)=='@')//to check for branch
{	
branch=filestring.substring(1,filestring.length()-1);
branch=branch.replace(" ","_");//to make branch one word if it contains
                               //more than one word
}
if(filestring.charAt(0)=='!')//to check students year
{
year=filestring.substring(1,filestring.length()-1);
year=year.replace(" ","_");
}
token=filestring.split(" ");
String tempname="";
for(int i=3;i<token.length-3;i++)
{
foundname=token[i];

if(name.equals(foundname) && token[token.length-3].equals(gender))
{
searches.add(filestring+" "+branch+" "+year);//concat matched name,branch and year
System.out.print(searches.size()+":");
for(int j=3;j<token.length-3;j++)
{
System.out.print(token[j]+" ");//print matched name
tempname=tempname+token[j]+" ";//concat the Strings of name
}
searchednames.add(tempname);//add full name to vector
tempname="";//reset String variable
System.out.println("");
break;
}
}
}
while(filestring.equals(end)==false);
if(searches.size()==0)
{
System.out.println("No result found");
continue;
}
System.out.println("");
System.out.println("Enter your Name's choice");
choice=Integer.parseInt(br2.readLine());
System.out.println("");
String[] newtoken=searches.get(choice-1).split(" ");
System.out.println("========================================================================");
System.out.println("Name:                   "+searchednames.get(choice-1)); 
System.out.println("Branch:                 "+newtoken[newtoken.length-2].replace("_"," "));
System.out.println("Class:                  "+newtoken[newtoken.length-1].replace("_"," "));
System.out.println("MHT-CET Rank/MERIT NO:  "+newtoken[0].trim());
System.out.println("MHT-CET Score/MARKS:    "+newtoken[1].trim());
System.out.println("DTE Enrollment ID:      "+newtoken[2].trim());
System.out.println("Gender :                "+newtoken[newtoken.length-5].trim());
System.out.println("Categeory:              "+newtoken[newtoken.length-4].trim());
System.out.println("Seat alloted:           "+newtoken[newtoken.length-3].trim());
System.out.println("========================================================================");
System.out.println("");
searches.clear();
searchednames.clear();
System.out.println("Do you want to continue,if yes true else false");
try
{
b=r.nextBoolean();
}
catch(Exception e)
{
	System.out.println("Invalid Input");
	return;
}
finally
{
	System.out.println("Thank you for using Dilip's Program");
}
}
}
}