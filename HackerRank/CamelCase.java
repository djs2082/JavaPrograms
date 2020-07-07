import java.util.*l
class StrongPassword
{
	public static void main(Srring args[])
	{
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		String s=r.next();
		int i;
		if(n<6)
		{
			System.out.println(6-n);
			exit();
		}
		byte[] bt=new byte[s.length()];
		boolean[] b=new boolean[4];
		for(i=0;i<4;i++)
		{
			b[i]=false;
		}
		for( i=0;i<bt.length;i++)
		{
			if(bt[i]>=48 && bt[i]<=57)
			{
				b[0]=true;
				continue;
			}
			if(bt[i]>=97 && bt[i]<=122)
			{
				b[1]=true;
				continue;
			}
			if(bt[i]>=65 && bt[i]<=97)
			{
				b[2]=true;
			continue;
			}
			if(bt[i]>=0 && bt[i]<48)
			{
				b[3]=true;
			}
			
		}
		for(i=0;i<4;i++)
		{
			if(b[i]==true)
			{	System.out.println(1);
			break;
			}
		}
	}
}
		
		
			
			