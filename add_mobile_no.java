import java.lang.*;
import java.util.*;
import java.io.*;
class Create_file
{
	static int i=0;
	String line;
	String file_name;
	boolean status=false;
	File file;

Create_file(String file_name)
{
	this.file_name=file_name;
	this.file=new File(file_name);

}

	void remove_garbage(String file_name)
	{
		
		try
		{
		BufferedReader br=new BufferedReader(new FileReader(file.getAbsoluteFile().getParent()+"\\"+file_name+".txt"));
		//System.out.println(file.getAbsoluteFile().getParent()+"\\"+file_name);
		
		//System.out.println(file.getAbsoluteFile().getParent()+file.getName().replaceAll(".txt","")+"_mf.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(file.getAbsoluteFile().getParent()+"\\"+file_name+"_mf.txt"));
		

		line=br.readLine();
		while(line!=null)
		{
			line=line.trim();
			try
			{
				status=line.substring(0,13).equals("<b>NAME :</b>");
			}
			catch(Exception e)
			{
				status=false;
			}
			if(status==true)
			{
			line=line.replaceAll("<b>NAME :</b>","");
			line=line.replaceAll("<br><b>REG.NO. :</b>","");
			line=line.replaceAll("<br><b>DEPT :</b>","");
			
			
			line=line.replaceAll("<br><b>MOBILE :</b>","");
			line=line.replaceAll("<br><b>EMAIL :</b>","");
			line=line.replaceAll("<br><br>","");
			//System.out.println(line);
			bw.write(line+"\n");
           }
            line=br.readLine();
	    }
	    br.close();
	    bw.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }

	}
	void combine_data(String file_name,BufferedWriter bw)
	{
		try
		{
		String line;
      //System.out.println("HII");
      //System.out.println(file.getAbsoluteFile().getParent()+"\\"+file_name+"_mf.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(file.getAbsoluteFile().getParent()+"\\"+file_name+"_mf.txt"));
		//System.out.println(file.getAbsoluteFile().getParent()+"\\"+file_name+"_mf.txt");
		line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			i++;
			bw.write(line+"\n");
			line=br.readLine();
		}
		br.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    
	    
	}
}

class change_file
{
	public static void main(String args[]) throws IOException
	{
	   String file_name="E:\\top_secret\\log.txt";
	   String line;
	   File file=new File(file_name);
	   Create_file create_file=new Create_file(file_name);
	   
	   BufferedReader br=new BufferedReader(new FileReader(file_name));
	   BufferedWriter bw=new BufferedWriter(new FileWriter(file.getAbsoluteFile().getParent()+"\\combined_data.txt"));
	   line=br.readLine();
       while(line!=null)
       {
       line=line.trim();
       create_file.remove_garbage(line);	
       create_file.combine_data(line,bw);
       System.out.println(line+" done");
       line=br.readLine();
	   }
	   br.close();
	   bw.close();
	   System.out.println(Create_file.i);
	


	}
}