import java.util.*;
class PandC
{int i,j;
private int amt;
private int sum;
private int max=0;

    PandC(int amt)    
{
        this.amt=amt;
    }
    int pandc(int[] n,int[] m)
    {
        for(i=0;i<n.length;i++)
        {
            for(j=0;j<m.length;j++)
            {
                sum=n[i]+m[j];
                if(sum<amt)
                {
                    if(max<sum)
                    {
                        max=sum;
                    }
                }
            }
        }
        return max;
    }
}
class Electronics
{
    public static void main(String args[])
    {
        int m,n,b;
        int i;
        int op;
System.out.println("Enter amount,number of usb and number of keyboard brands");
        Scanner r=new Scanner(System.in);
        b=r.nextInt();
        n=r.nextInt();
        m=r.nextInt();
        int[] ni=new int[n];
        int[] mi=new int[m];
System.out.println("Enter the number of models of each brand of usb");
for(i=0;i<n;i++)
{
    ni[i]=r.nextInt();

}

System.out.println("Enter the number of models of each brand of keyboard");
for(i=0;i<m;i++)
{
    mi[i]=r.nextInt();
}
PandC pc=new PandC(b);
op=pc.pandc(ni,mi);
if(op==0)
System.out.println("you cant buy both");
else
System.out.println("you can atmost spend to buy both:"op);
    }
}
