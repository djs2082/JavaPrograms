import java.lang.*;
import java.util.*;
import java.io.*;
class Coutnt_line
{
	public static void main(String args[]) throws IOException
	{
	   String file_name="E:\\top_secret\\log.txt";
	   String line;
	   String line2;
	   int i=0;
	   File file=new File(file_name);
	   BufferedReader br=new BufferedReader(new FileReader(file_name));
	   BufferedReader br2=null;
	   BufferedWriter bw=new BufferedWriter(new FileWriter(file.getAbsoluteFile().getParent()+"\\lines.txt"));
	   line=br.readLine();
       while(line!=null)
       {

       line=line.trim();
       br2=new BufferedReader(new FileReader(file.getAbsoluteFile().getParent()+"\\"+line+".txt"));
       line2=br2.readLine();
       

      while(line2!=null)
		{
			line2=line2.trim();
			try
			{
				if(line2.substring(0,13).equals("<b>NAME :</b>"))
				{
					i++;
				}
			}
			catch(Exception e)
			{
				
			}
			line2=br2.readLine();
		}
        
bw.write(line+" "+i+"\n");
i=0;
       System.out.println(line+" done");
       line=br.readLine();
	   }
	   br.close();
	   bw.close();
	   br2.close();
	
	


	}
}