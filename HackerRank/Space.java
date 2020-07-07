    import java.util.*;
	class Space
	{
	public static void main(String args[]) {
	Scanner r=new Scanner(System.in);
	int n=r.nextInt();
	int m=r.nextInt();
	int[] c=new int[m];
	
        int i=0;
		int max=0;
        
      
		for(i=0;i<m;i++)
		c[i]=r.nextInt();
	for(i=0;i<m;i++)
        {
            if(c[i]>max)
            max=c[i];
		}
		System.out.println(max);
        int min1=max;
        int min2=0;
        int d;
        int j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<c.length;j++)
            {
                d=c[j]-i;
                if(d<0)
                d=-d;
                if(d<min1)
                min1=d;
			System.out.println(d+"d"+min1+"min");
            }
            if(min1>min2)
            {
                min2=min1;
            }
            min1=max;
			System.out.println(min2+"min2");
        }
        System.out.println(min2);
		}


    }