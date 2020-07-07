import java.io.*;
import java.util.*;
class Predict
{
public static void main(String args[])throws IOException
{
BufferedReader bru=new BufferedReader(new InputStreamReader(System.in));
BufferedReader brf=new BufferedReader(new FileReader("re6.txt"));
String ter="this is last line";
String s="";
String branch="";
String college="";
int temp=0;
int c=1;
boolean bk=false;
String[] token;
String categeory;
String rank;
String tempcollege="";//new
categeory=bru.readLine();
rank=bru.readLine();
do
{
	//System.out.println(brf.readLine());
	s=brf.readLine();
	s=s.trim();
	//System.out.println(s);
	if(s.charAt(0)=='!')
	{
		//s=s.replace(" ","_");
		college=s;
		//System.out.println(college);
		continue;
	}
	if(s.charAt(0)=='@')
	{
		//s=s.replace(" ","_");
		branch=s;
		continue;
	}
	token=s.split(" ");
	try
	{
	if(bk==true && Integer.parseInt(token[temp])>=Integer.parseInt(rank))
	{
		//college.replace(" ","_");
		//branch.replace(" ","_");
		if(tempcollege.equals(college))
			System.out.println(branch.substring(1,branch.length()-1));
		else
		{
			System.out.println("========================================================================================================================");
		System.out.println(c+")"+college.substring(1,college.length()-1));
		System.out.println("========================================================================================================================");
	System.out.println(branch.substring(1,branch.length()-1));
		c++;
		}
		bk=false;
		tempcollege=college;
	}
	}
	catch(Exception e)
	{
		
		continue;
	}
	for(int i=0;i<token.length;i++)
	{
		if(token[i].equals(categeory))
		{
			//System.out.println("hii");
			bk=true;
			temp=i;
		}
	}
	
}
while(s.equals(ter)==false);
}
}