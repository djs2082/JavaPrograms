import java.io.*;
class FileHandlingNameSearch
{
public static void main(String args[]) throws IOException
{
BufferedReader bin1=new BufferedReader(new FileReader("check2.txt"));
//BufferedReader bin3=new BufferedReader(new FileReader("check.txt"));
BufferedReader bin2=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Student as it is given to DTE");
String s=bin2.readLine();
s=s.toUpperCase();
String i;
int c=0;
String j;

do
{

i=bin1.readLine();
j=i;



if(i==null)
break;
try
{	
i=i.substring(0,50);
i=i.trim();



}
catch(Exception e)
	{
		System.out.println("No,This student is not present in SGGS");
		return;
	}
	
	
	if(s.substring(0,5).equals(i.substring(0,5)))
	{
		if(c==0)
		{
		System.out.println("");
		System.out.println("Other Searches are: ");
		System.out.println("");
		
		}
		System.out.println(i);
		
	}
	
if(s.equals(i))
{
	j=j.trim();
System.out.println("Yes,This is the Student of SGGS");
	System.out.println("HE/SHE had scored "+j.substring(j.length()-3)+" marks in MHT-CET");
	
	

}

c++;
}
while(i!=null);

}
}