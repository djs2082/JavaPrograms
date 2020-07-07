import java.util.*;
class Sale
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int p=r.nextInt();
int d=r.nextInt();
int m=r.nextInt();
int s=r.nextInt();
    boolean bt=true;
        int c=0;
        while(bt)
        {
		System.out.println(s+"s");
		System.out.println(p+"p");
            if(s>=p)
            {
                c++;
				System.out.println(c);
            }
            else 
            {
                break;
            }
			s=s-p;
            if(p>=m)
            {
                p=p-d;
            }
			if(p<m)
				p=m;
			
            
        }
		System.out.println(c);
		}
		}