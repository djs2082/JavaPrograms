import java.util.*;
import java.io.*;
class Duplicate
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("re4.txt"));
BufferedWriter bw=new BufferedWriter(new FileWriter("re5.txt"));

String ter="this is last line";
String s="";
String temp=br.readLine();
bw.write(ter);
do
{
s=br.readLine();
System.out.println(s+" "+temp);
if(s.equals(temp))
{
	temp=s;
continue;
}
bw.write(s);
bw.write(System.getProperty("line.separator"));

System.out.println(s+" "+temp);

}
while(s.equals(ter)==false);
br.close();
bw.close();
}
}