import java.util.*;
class Count
{
    private int c;
    int i=0;
int[] count;
static int lt;
Count(int l)
{
lt=l;
if(lt<0)
lt=-lt+1;
else
lt=lt+1;

}

    Count(int s,int t)
    {


count=new int[lt];

         
        
        while(s<=t)
        {
            count[i]=s;
            
            

i++;
s++;

        }

    }
    int[] add(int a,int[] mv)
    {
        for(i=0;i<mv.length;i++)
        {
            mv[i]=mv[i]+a;



        }

        return mv;
    }
   int check(int[] nv)
   { c=0;
       for(i=0;i<nv.length;i++)
       {
for(int j=0;j<count.length;j++)
{
           if(nv[i]==count[j])
           {
  

              c++;

           }
}
           

       }


return c;
   } 
}
class Fruits
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int m,n;
        int a,b;
        int s,t;
        int[] M;
        int[] N;
        int A,O;
int z;
int i;
        s=r.nextInt();
        t=r.nextInt();
        a=r.nextInt();
        b=r.nextInt();
        m=r.nextInt();
        n=r.nextInt();

        M=new int[m];
        N=new int[n];
        for(i=0;i<m;i++)
        {
            M[i]=r.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            N[i]=r.nextInt();
        }

z=s-t;
Count cd=new Count(z);
        Count co=new Count(s,t);
        M=co.add(a,M);
        N=co.add(b,N);
        A=co.check(M);
        O=co.check(N);
        System.out.println(A);
        System.out.println(O);
        

    }
}
