import java.util.*;
class SequenceEquation
{
public static void main(String args[])
{
Scanner rs=new Scanner(System.in);
int n=rs.nextInt();
int[] p=new int[n];
int i;
        int j;
        int k;
        int temp;
		for(i=0;i<n;i++)
		p[i]=rs.nextInt();

Vector<Integer> v=new Vector<Integer>();
int[] q=new int[p.length];
        int[] r=new int[p.length];
        
        for(i=0;i<p.length;i++)
        {
            q[i]=p[i];
        }
        for(i=0;i<q.length-1;i++)
        {
            for(j=i;j<q.length;j++)
            {
                if(q[i]>q[j])
                {
                    temp=q[i];
                    q[i]=q[j];
                    q[j]=temp;
                }
            }
			}
			for(i=0;i<q.length;i++)
				System.out.println(q[i]+"q");
            for(i=0;i<q.length;i++)
            {
                for(j=0;j<p.length;j++)
                {
                    if(q[i]==p[j])
                    {
						System.out.println(j+1+"j");
                        for(k=0;k<p.length;k++)
                        {
                            if(p[k]==(j+1))
								
                            {
							System.out.println(k+1+"k");	
v.add(k+1);
break;
                            }
                        }
						break;
                    }
                }
            }
			for(i=0;i<p.length;i++)
			System.out.println(v.get(i));
        }
		}