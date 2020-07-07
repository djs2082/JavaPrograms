import java.util.*;
class KaprekarNumber
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
String p=r.next();
String q=r.next();
long i;
int ip1;
int ip2;
 
        for(i=Integer.parseInt(p);i<=Integer.parseInt(q);i++)
        {
            String ii=String.valueOf(i);
            String sq=String.valueOf(i*i);
			
		/*System.out.println(p+" "+q+" "+sq);*/
		if(ii.length()==sq.length())
		{
			ip1=0;
			ip2=Integer.parseInt(sq);
		}
		else
		{
            String p1=sq.substring(0,(sq.length()-ii.length()));
           String p2=sq.substring((sq.length()-ii.length()),sq.length());
		   /*System.out.println(p1+" "+p2);*/
		   ip1=Integer.parseInt(p1);
		   ip2=Integer.parseInt(p2);
		   
		}
            if((ip1+ip2)==Integer.parseInt(ii))
			{
            System.out.println(i+" "+sq);
			}
                   }


    }
	}