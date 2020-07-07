			
	import java.util.*;
class PickingNumbers
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int[] a=new int[n];
        int i;
        for(i=0;i<a.length;i++)
            a[i]=r.nextInt();
        int j;
        int k;
        int size=-1;
        int d1;
        int d2;
        Vector<Integer> v=new Vector<Integer>();
        int max=0;
        boolean bk=true;
        for(i=0;i<a.length;i++)
        {
            v.add(a[i]);
            for(j=0;j<a.length;j++)
            {
                
                d1=a[i]-a[j];
                if(d1<0)
                    d1=-d1;
                if(d1>=0 && d1<=1)
                {
                    for(k=0;k<v.size();k++)
                    {
                        d2=v.get(k)-a[j];
                        if(d2<0)
                            d2=-d2;
                        if((d2>=0 && d2<=1)==false)
                        {
                            bk=false;
                            break;
                        }
                    }
                    if(bk==true)
                        v.add(a[j]);
                    bk=false;
                }
                            
                        
            }
            if(v.size()>max)
                max=v.size();
        }            
                        
                        
    }                        
                        
}                        
					
						
						
						
						
						
							
						
				
				
				
				
				
				
				
				
				
				
				
				
				