import java.util.*;

 class FunnyString {

    public static void main(String args[])
	{
	Scanner r=new Scanner (System.in);
	String s=r.next();
            byte[] bt1=s.getBytes();
            StringBuffer sb=new StringBuffer(s);
            sb.reverse();
            byte[] bt2=sb.toString().getBytes();
			for(int i=0;i<bt1.length;i++)
			{
			System.out.println(bt1[i]+" "+bt2[i]);
			}
            int d=bt1[1]-bt1[0];
            if(d<0)
            d=-d;
			System.out.println(d+"d");
            boolean bk=true;
            int t=0;
            for(int i=0;i<bt1.length-1;i++)
            {
                    t=bt1[i+1]-bt1[i];
                    if(t<0)
                    t=-t;
                    if(t!=d)
                    {
                            bk=false;
                            break;
                    }
            }
            if(bk==true)
            {
                    for(int i=0;i<bt2.length-1;i++)
                    {
                            t=bt2[i+1]-bt2[i];
                            if(t<0)
                            t=-t;
                            if(t!=d)
                            {
                                    bk=false;
                                    break;
                            }

                    }
                    
            }
                if (bk == true)
                        s = "Funny";
                else
                        s = "Not Funny";
                System.out.println(s);
				}
				}
				

