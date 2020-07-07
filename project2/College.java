import java.util.*;
import java.io.*;
class College
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("re6.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("re7.txt"));
		boolean bk=false;
		String s="";
		s=s.trim();
		String result="";
		String[] token;
		String ter="this is last line";
		do
		{
			s=br.readLine();
			s=s.trim();
			token=s.split(" ");
			result=s;
			for(int i=0;i<token.length;i++)
			 {
				if(token[i].equals("Engineering"))
				  {
					 bk=true;
					 break;
				}
				 // if(token[0].length()==10 && token[0].charAt(0)=='@')
				 // {
					 // result="@";
					 // for(int i=1;i<token.length;i++)
					 // {
						 // result=result+token[i];
					 // }
					 
				// }
				 if(token[i].equals("Technology"))
				 {
					  bk=true;
					  break;
				  }
				if(token[i].equals("Electronics"))
				  {
					  bk=true;
					  break;
				 }
				if(token[i].equals("Institutes,"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Campus,"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Institutes,"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Institutions,"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Education"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Campus"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("School"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Group"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Academy"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Government"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("University,"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("Technological"))
				{
					bk=true;
					break;
				}
				if(token[i].equals("University"))
				{
					bk=true;
					break;
				}
			 }
			try
			{
			if(bk==true && token.length<5)
			 {
				result="";
				for(int i=1;i<token.length;i++)
					result=result+token[i];
			 }
			}
			catch(Exception e)
			{
				bk=false;
				result="";
				continue;
			}
			// }
			//System.out.println(result);
			bw.write(result);
			result="";
			bk=false;
			bw.write(System.getProperty("line.separator"));
		}
		while(s.equals(ter)==false);
		br.close();
		bw.close();
	}

}
