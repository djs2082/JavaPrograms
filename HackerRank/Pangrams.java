import java.util.*;
class Pangrams
{

public static void main(String args[])
 {
 Scanner r=new Scanner(System.in);
 String s=r.nextLine();
            
            s=s.replace(' ','!');
			System.out.println(s);
            byte[] bt=s.getBytes();
            boolean bk=false;
            for(int i=0;i<bt.length;i++)
            {
                    if(bt[i]>=65 && bt[i]<=90)
                    bt[i]=(byte)(bt[i]-65);
                    else if(bt[i]>=97 && bt[i]<=122)
                     bt[i]=(byte)(bt[i]-97);
                     else 
                     bt[i]=0;
            }
			Arrays.sort(bt);
			for(int i=0;i<bt.length;i++)
			System.out.println(bt[i]);
            for(int i=1;i<=25;i++)
            {
                    for(int j=0;j<bt.length;j++)
                    {
                            if(i==bt[j])
                            {
                                    bk=true;
									System.out.println(bt[j]+" "+i);
                                    break;
                            }
							
                            
                    }
                    if(bk==false)
                    break;
            }
if(bk==false)
s="not pangram";
else 
s="pangram";
System.out.println(s);
}
}

