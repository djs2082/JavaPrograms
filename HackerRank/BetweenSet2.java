import java.util.*;
class Set
{
    Scanner r=new Scanner(System.in);
    private int i;
    private int j;
    private int k;
    private int m;
    private int n;
    private int ch;
    private boolean b1=true;
    private   boolean b2=true;
    private int c=0;
    Vector<Integer> v=new Vector<Integer>();
    private int[][] a=new int[3][];
    Set(int m,int n)
    {
        this.m=m;
        this.n=n;
        a[0]=new int[m];
        a[1]=new int[n];
        for(i=0;i<m;i++)
        {
            a[0][i]=r.nextInt();;
        }
        for(i=0;i<n;i++)
        {
            a[1][i]=r.nextInt();
        }
    }
    void setter()
    {
        ch=a[1][0]-a[0][1];
        if(ch<0)
        {
            ch=-ch;

        }
        a[2]=new int[ch+1];
        j=a[0][m-1];
        for(i=0;i<ch+1;i++)
        {
            a[2][i]=j;
            j++;
        }
    }
    void check1()
    {
        for(i=0;i<(ch+1);i++)
        {
            b1=true;
            for(j=0;j<m;j++)
            {
                if(a[2][i]%a[0][j]!=0)
                {
                    b1=false;
                    break;
                }
            }
        
         if(b1==true)
         {
            v.add(a[2][i]);

         }
        }
    }
    int check2()
    {
        for(i=0;i<v.size();i++)
        {
            b2=true;
            for(j=0;j<n;j++)
            {
                if(a[1][j]%v.get(i)!=0)
                {
                    b2=false;
                    break;
                }
            }
            if(b2==true)
            {
                c++;
            }
        }
        return c;

    }


}
class BetweenSet2
{
    public static void main(String args[])
    {
        Scanner r2=new Scanner(System.in);
        int m=r2.nextInt();
        int n=r2.nextInt();
        Set s=new Set(m,n);
        s.setter();
        s.check1();
        int c=s.check2();
        System.out.println(c);
    }
}