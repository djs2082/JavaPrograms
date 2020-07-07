import java.util.*;
class Substringcount
{
public static void main(String args[])
{
String s="aba";
long n=10;
long temp=n%s.length();
Vector<Integer> v=new Vector<Integer>();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {v.add(i);

			}      }
        long sum=0;
        long m;
        for(i=0;i<v.size();i++)
        {
		
            m=(n-v.get(i))/s.length();
			System.out.println(m+"m");
			long nw=m+1;
            if(s.length()==1 || v.get(i)==0)
            nw=m;
		
            sum=sum+nw;
			long j;
			for(j=n;j<temp;j++)
				sum++;
        }
        
       
      System.out.println(sum);
      

    }
}