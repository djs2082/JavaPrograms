import java.util.*;
class StringDelete
{
	public static void main(String args[])
	{
		
		Scanner r=new Scanner(System.in);
		
		String s=r.next();
		StringBuffer sb=new StringBuffer(s);
		int i=0;
		int j;
		boolean b=true;
		
		while(b)
		{
		while(i<sb.length()-1)
		{
			if(sb.charAt(i)==sb.charAt(i+1))
			{
				sb.deleteCharAt(i);
				sb.deleteCharAt(i);
				i=0;
			}
			else
			{
				i++;
			}
		}
		
		
		
		if(sb.length()==0)
			b=false;
		
		for(j=0;j<sb.length()-1;j++)
		{
			if(sb.charAt(j)==sb.charAt(j+1))
			{	b=true;
		i=0;
		break;
			}
			else
				b=false;
			
		}
		
		}
		if(sb.length()==0)
			System.out.println("Empty String");
		else
		System.out.println(sb);
		
	}

}	
	
