import java.util.*;
class Pangrams
{

public static void main(String args[])
 {
 Scanner r=new Scanner(System.in);
 s=r.nextLine();
            
            s=s.replace(' ','!');
            byte[] bt=s.getBytes();
            boolean bk=false;
            for(int i=0;i<bt.length;i++)
            {
                    if(bt[i]>=65 && bt[i]<=97)
                    bt[i]=(byte)(bt[i]-65);
                    else if(bt[i]<=97 && bt[i]>=122)
                     bt[i]=(byte)(bt[i]-97);
                     else 
                     bt[i]=0;
            }
			Arrays.sort(bt);
			for(int i=0;i<bt.length;i++)
			System.out.println(bt[i]);
            for(int i=1;i<=26;i++)
            {
                    for(int j=0;j<bt.length;j++)
                    {
                            if(bt[i]==bt[j])
                            {
                                    bk=true;
                                    break;
                            }
                            else
                            bk=false;
                    }
                    if(bk=false)
                    break;
            }
if(bk==false)
s="not pangram";
else 
s="pangram";
System.out.println(s);
}
}

