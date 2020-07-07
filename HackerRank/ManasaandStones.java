import java.util.*;

class ManasaandStones
{
	public static void main(String args[])
	{
	
Scanner r=new Scanner(System.in);

int n=r.nextInt();
int a=r.nextInt();
int b=r.nextInt();
        int i;
        int j;
		int t;
        int k;
        int sum=0;
        Vector<Integer> v2=new Vector<Integer>();
        Vector<Integer> v=new Vector<Integer>();
		
        for(i=0;i<n-1;i++)
        {
            for(k=0;k<i;k++)
            {
                sum=sum+a;
				System.out.println(sum+"a");
            }
            for(j=i;j<n-1;j++)
            {
                sum=sum+b;
				System.out.println(sum+"b");
            }
            v.add(sum);
			System.out.println(sum);
            sum=0;
        }
        sum=0;
        for(i=0;i<n-1;i++)
        {
            for(k=0;k<i;k++)
            {
                sum=sum+b;
            }
            for(j=i;j<n-1;j++)
            {
                sum=sum+a;
            }
            v.add(sum);
            sum=0;
        }
        sum=0;
        for(i=0;i<n-1;i++)
        {
            sum=sum+a;
			System.out.println(sum+"a");
        }
        sum=0;
        for(i=0;i<n-1;i++)
        {
            sum=sum+b;
			System.out.println(sum+"b");
        }
		for(i=0;i<v.size()-1;i++)
		{
			for(j=i;j<v.size();j++)
			{
				if(v.get(i)>v.get(j))
				{
					t=v.get(i);
					v.insertElementAt(i,j);
					v.insertElementAt(j,t);
				}
			}
		}
        for(i=0;i<v.size()-1;i++)
        {
            if(v.get(i)!=v.get(i+1))
            {
                     v2.add(v.get(i));
            }
        }
		
        v2.add(v.get(v.size()-1));
     
        for(i=0;i<v2.size();i++)
        {
            System.out.println(v2.get(i));
        }


}
    }
	