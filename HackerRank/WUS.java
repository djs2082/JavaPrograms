import java.util.*;
class WUS
{
 public static void main(String args[])

 {
 Scanner r=new Scanner (System.in);
 String s=r.next();
 int n=r.nextInt();
 int[] queries=new int[n];
 for(int i=0;i<n;i++)
 queries[i]=r.nextInt();
            String[] rs=new String[queries.length];
            byte[] bt=s.getBytes();
            int sum=0;
            int k=0;
            for(int i=0;i<bt.length;i++)
            bt[i]=(byte)(bt[i]-65);
            int g=0;
            for(int i=0;i<bt.length;i++)
            {
                    for(int j=0;j<bt.length;j++)
                    {
                            for(k=i;k<=j;k++)
                            {
                                    sum=sum+bt[k];
                                    if(sum==queries[g])
                                    {
                                            rs[i]="YES";
                                            sum=0;
                                            g++;
                                            break;
                                    }

                            }
                            if(sum==0)
                            break;
                    }
            }
            
			
			
			for(int i=0;i<n;i++)
			System.out.println(rs[i]);
			}
			}
