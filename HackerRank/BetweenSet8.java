import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Set
{
    private int i;
    private int j;
    private int ch;
    private int k;
    private int m;
    private int n;
    int l=0;
    private boolean b1=true;
    private boolean b2=true;
    private int c=0;
    Scanner r1=new Scanner(System.in);
    Vector<Integer> v=new Vector<Integer>();
    private int[][] a=new int[3][];
    Set(int m,int n)
    {
        this.m=m;
        this.n=n;
       
       
    
    }
    void setter(int[][] a2,int ch)
    {
     a=a2; 
     this.ch=ch;  
    }
    void check1()
    {
        for(i=0;i<(ch+1);i++)
        {
            b1=true;
            for(j=1;j<m;j++)
            {
                if(a[2][i]%a[0][j]!=0)
                {
                    b1=false;
                    break;

                }
            }
            if(b1==true)
            {
                v.addElement(new Integer(a[2][i]));
                

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
                if(v.get(i)==0)
                continue;
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
class BetweenSet8
{
    public static void main(String args[])
    {
        int i;
        Scanner r2=new Scanner(System.in);
        int[][] a=new int[3][];
        int m=r2.nextInt();
        int n=r2.nextInt();
        a[0]=new int[m];
        a[1]=new int[n];
        for(i=0;i<m;i++)
        {
            a[0][i]=r2.nextInt();
        }
        for(i=0;i<n;i++)
        {
            a[1][i]=r2.nextInt();

        }
int ch=a[1][0]-a[0][m-1];
if(ch<0)
ch=-ch;
a[2]=new int[ch+1];
int j=a[0][m-1];
for(i=0;i<ch+1;i++)
{
    a[2][i]=j;
    j++;

}
        Set s=new Set(m,n);
        
        s.setter(a,ch);
        s.check1();
        int c=s.check2();
    }
}