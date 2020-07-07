import java.util.*;
class Bike

    {
	public static void main(String args[])
	{
	Scanner r=new Scanner(System.in);
	int n=r.nextInt();
	String s=r.next();
        Vector<Integer> v=new Vector<Integer>();
        if(s.charAt(0)=='D')
        v.add(0);
        int j;
        int i;
        int c=0;
        int sum=0;
		j=0;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='U')
            sum=sum+1;
            else
            sum=sum-1;
            if(sum==0)
			{
            v.add(i);
			System.out.println(v.get(j)+"sum"+s.charAt(v.get(j)));
			j++;
			if(s.CharAt(i)!=s.charAt(i+1)
				v.add(i+1);
			}
			
            
        }
        for(i=0;i<v.size();i++)
        {
            if(s.charAt(v.get(i))=='D')
            {
                for(j=i;j<v.size();j++)
                {
                    if(s.charAt(v.get(j))=='U')
                    {c++;
				System.out.println(c+"c");
				break;
					}
                }
            }
        }
		System.out.println(c);
		}
		}