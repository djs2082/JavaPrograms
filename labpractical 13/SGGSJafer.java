import java.io.*;
import java.util.*;
class SGGSJafer
{
	
	// public SGGSJafer(){
		// private String name;
		// private static int counter=0
		
		
		// {
public static void main(String args[]) throws IOException
{
String year="";
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
Vector<String> v=new Vector<String>();
Vector<String> v2=new Vector<String>();
String temp;
int choice;
//StringBuffer sb;
//int c=0;
String end="this is last line";

String branch="";
Scanner r=new Scanner(System.in);
String fname;
String[] token;
boolean b=true;
int c=0;
while(b)
{
	BufferedReader br1=new BufferedReader(new FileReader("cutoff.doc"));
System.out.println("Enter students FirstName or MiddleName or LastName");
String name=br2.readLine();
StringTokenizer st=new StringTokenizer(name);
name=st.nextToken();
System.out.println("Enter students Gender");
String gender=br2.readLine();
gender=gender.toUpperCase();
gender=gender.substring(0,1);
System.out.println("");
name=name.toUpperCase();

//int tokens;

do
{
fname=br1.readLine();
c++;
try
{
fname=fname.trim();
}
catch(Exception e)
{
//return;
//return;
//return;
}

if(fname.charAt(0)=='@')
{	branch=fname.substring(1,fname.length()-1);
branch=branch.replace(" ","_");
//System.out.println(branch+" "+fname);
   /* sb=new StringBuffer(branch);
	sb.replace(" ","_");
	branch=sb.toString();
	*/
}


//	System.out.println(fname+" hii "+c);

//System.out.println(fname);
//StringTokenizer st=new StringTokenizer(fname);
//tokens=st.countTokens();
//System.out.println(tokens);
token=fname.split(" ");


String tempname="";
for(int i=3;i<token.length-3;i++)
{
	
	temp=token[i];
	if(name.equals(temp) && token[token.length-3].equals(gender))//&&gender.equals(token[token.length-3]));
	{
		//System.out.println(token[token.length-3]);
		//System.out.println(gender);
		//c++;
		
		v.add(fname+" "+branch);
		//if(c==4)
		System.out.print(v.size()+":");//+fname.substring(0,40));
	for(int j=3;j<token.length-3;j++)
	{
		System.out.print(token[j]+" ");
		tempname=tempname+token[j]+" ";
		
	}
	v2.add(tempname);
	tempname="";
	System.out.println("");
		break;
		
	}
	
}
//c=0;

//System.out.println(fname);
}
while(fname.equals(end)==false);
if(v.size()==0)
{
	System.out.println("No result found");
	continue;
}
System.out.println("");
System.out.println("Enter your Name's choice");
choice=Integer.parseInt(br2.readLine());
System.out.println("");
//System.out.println(v.get(choice-1));
String[] newtoken=v.get(choice-1).split(" ");
//String[] brtoken=v2.
if(newtoken[2].substring(2,4).equals("17"))
{year="SY B.tech";
}
else
{
	year="FY B.tech";
}
String no="9";
for(int i=0;i<9;i++)
{
no=no+(int)(Math.random()*10);
}
System.out.println("========================================================================");
System.out.println("Name:                   "+v2.get(choice-1)); 
//token=new v.get(choice-1).split(" ");

System.out.println("Branch:                 "+newtoken[newtoken.length-1].replace("_"," "));
System.out.println("Class:                  "+year);
System.out.println("Mob.no:                 "+no);
System.out.println("MHT-CET Rank/MERIT NO:  "+newtoken[0].trim());
System.out.println("MHT-CET Score/MARKS:    "+newtoken[1].trim());
System.out.println("DTE Enrollment ID:      "+newtoken[2].trim());
System.out.println("Gender :                "+newtoken[newtoken.length-4].trim());
System.out.println("Categeory:              "+newtoken[newtoken.length-3].trim());
System.out.println("========================================================================");
System.out.println("");
v.clear();
v2.clear();
System.out.println("Do you want to continue,if yes true else false");
b=r.nextBoolean();
}
}
}
