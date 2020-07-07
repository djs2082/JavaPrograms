import java.util.*;
class HWinaString
{

 public static void main(String args[])
 {
 Scanner r=new Scanner(System.in);
 int n=r.nextInt();
 String s[]=new String[n];
 for(int i=0;i<n;i++)
  s[i]=r.next();
            String sh="hackerrank";
            boolean bk=false;
			boolean ch=false;
			int k=0;
			int g=0;
			while(g<n)
			{
            StringBuffer sb=new StringBuffer(s[g]);
            for(int i=0;i<sh.length();i++)
				
            {
				if(ch==true)
					k=1;
                    for(int j=k;j<sb.length();j++)
                   {
                           if(sh.charAt(i)==sb.charAt(j))
                           {
							   System.out.println(sb.charAt(j));
                                   sb.delete(0,j);
								   s[g]=sb.toString()+"  ";
								   sb=new StringBuffer(s[g]);
								   System.out.println(sb);
								   
                                   bk=true;
                                   break;
                           }
                           else
                           bk=false;





                   }
                   if(bk==false)
                   break;
			   ch=true;
            }

            if(bk==false)
            s[g]="NO";
            else
            s[g]="YES";
		g++;
		bk=false;
		ch=false;
	
	k=0;
		
			}
			for(int i=0;i<n;i++)
System.out.println(s[i]);
}
}

