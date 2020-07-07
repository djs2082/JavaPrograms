import java.util.*;
 class CloudJump {

public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int k=r.nextInt();
int[] c=new int[n];

        int i=0;
        int e=100;
        boolean b=true;
		for(i=0;i<n;i++)
		c[i]=r.nextInt();
        while(b)
        {
            i=(k+i)%c.length;
            if(c[i]==1)
            {
                e=e-3;
            }
            else
            e=e-1;
		System.out.println(e);
            if(i==0)
            b=false;

        }
		System.out.println(e);
}
 }