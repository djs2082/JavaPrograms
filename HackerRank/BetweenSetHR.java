import java.util.*;
class Set
{
    int i;
    private int[] a;
    private int[]b;

    private int m;
    private int n;
    int j;
    private int max=0;
    private int min=0;
    private int cter=0;
    private int[] c;
    boolean rset=true;
    boolean rrset=true;
    Scanner r=new Scanner(System.in);
    void setter(int m,int n)
    {
        this.m=m;
        this.n=n;
        a=new int[m];
        b=new int[n];
        for(i=0;i<m;i++)
        {
            a[i]=r.nextInt();

        }
        for(i=0;i<n;i++)
        {
            b[i]=r.nextInt();
        }

    }
    void getter()
    {
        int j=0;
        c=new int[(m+n)-1];
        for(i=a[m-1];i<=b[n-1];i++)
        {
            c[j]=i;

           j++; 


        }
    }

   
    void maxmin()
    {
        max=c[0];
        min=c[0];
        for(i=0;i<(m+n-1);i++)
        {
            if(c[i]>max)
            max=c[i];
            if(c[i]<min)
            min=c[i];

        }

    }
    int check()
    {
        
        for(i=1;i<=max;i++)
        {
            for(j=1;j<(m);j++)
            {
               if(i%a[j]!=0)
              { rset=false;
               break;
              }
              if(rset==true)
              {
                  for(int k=0;k<n;k++)
                  {
                      if(b[k]%i!=0)
                      {
                         
                          rrset=false;
                          break;
                      }

                  }
              }




            }
            if(rrset==true)
            cter++;
            rset=true;
            rrset=true;
        }
        return cter;
    }
}
class BetweenSet
{
    public static void main(String args[])
    {
        Scanner r2=new Scanner(System.in);
        Set s=new Set();
        int m,n,d;
        m=r2.nextInt();
        n=r2.nextInt();
        s.setter(m,n);
        s.getter();
        s.maxmin();
            d=s.check();
            System.out.println(d);
        
    }
}
        