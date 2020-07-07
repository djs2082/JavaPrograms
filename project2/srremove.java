import java.io.*;
import java.util.*;
class srremove
{
public static void main(String args[])throws IOException
{
BufferedReader brr=new BufferedReader(new FileReader("ncf.txt"));
BufferedWriter brw=new BufferedWriter(new FileWriter("re2.txt"));
String ter="this is last line";
String s;
String[] token;
String result="";
do
{
s=brr.readLine();
//System.out.println(s);
s=s.trim();
token=s.split(" ");
//s=s.trim();
result=s;
if(token.length==1)
{
	continue;
}
//for(int i=1;i<token.length;i++)
//{
//result=result+token[i]+" ";
//}
//}
//System.out.println(result);
brw.write(result);
result="";
brw.write(System.getProperty("line.separator"));

}
while(s.equals(ter)==false);
brr.close();
brw.close();
}
}

