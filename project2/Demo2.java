import java.io.*;
import java.util.*;
class namesalling
{
public static void main(String args[])throws IOException
{
	int c=0;
String ter="this is last line";
String[] token1;
String[] token2;
String s="";
String result="";
BufferedReader br=new BufferedReader(new FileReader("demo.txt"));
BufferedWriter brw=new BufferedWriter(new FileWriter("demo2.txt"));
String temp=br.readLine();
do
{
s=br.readLine();
s=s.trim();
temp.trim();
token2=s.split(" ");
token1=temp.split(" ");
result=s;
if(token2.length==1)
{
	result="";
for(int i=0;i<token1.length-3;i++)
{
result=result+token1[i]+" ";
}
System.out.println(token2[0]);
System.out.println(token1.length);
System.out.println(token1[token1.length-1]);
result=result+" "+token2[0]+" "+token1[token1.length-3]+" "+token1[token1.length-2]+" "+token1[token1.length-1];
}
//System.out.println(result);
brw.write(result);
temp=s;
c++;
//System.out.println(s+" "+ter);
brw.write(System.getProperty("line.separator"));
}
while(s.equals(ter)==false);
System.out.println(c);
}
}