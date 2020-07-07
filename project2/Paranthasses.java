import java.util.*;
import java.io.*;
class College
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("re3.txt"));
		BufferedReader bw=new BufferedWriter(new FileWriter("re4.txt"));
		boolean bk=false;
		String s="";
		String result="";
		String[] token;
		String ter="this is last line";
		do
		{
			s=br.readLine();
			token=s.split(" ");
			result=s;
			for(int i=0;i<token.length;i++)
			{
				if(token[i].equals("Engineering"))
				{
					bk=true;
					break;
				}
			}
			if(bk==true && token.length>5)
			{
				result="";
				result="!"+s+"!";
			}
			System.out.println(result);
			bw.write(result);
			result="";
			bk=false;
		}
		while(s.equals(ter)==false);
	}
}
