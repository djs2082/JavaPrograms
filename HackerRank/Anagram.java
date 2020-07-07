  import java.util.*;
  class Anagram
  {
  public static void main(String args[])
  {
  Scanner r=new Scanner(System.in);
  String s1=r.next();
  String s2=r.next();
            byte[] bt1=s1.getBytes();
            byte[] bt2=s2.getBytes();
            Arrays.sort(bt1);
            Arrays.sort(bt2);
            int c=0;
            int min=0;
            for(int i=0;i<bt1.length;i++)
            {
                    System.out.print(bt1[i]+" ");
            }
            int k=0;
            System.out.println(" ");
            for(int i=0;i<bt2.length;i++)
            {
                    System.out.print(bt2[i]+" ");
            }
            System.out.println(" ");
            for(int i=0;i<bt1.length;i++)
            {
                    for(int j=k;j<bt2.length;j++)
                    {
                    if(bt1[i]==bt2[j])
                    { 
                            c=c+2;
                            bt2[j]=0;
                            k=j;
                            System.out.print(bt1[i]+"    "+bt2[j]);
                            break;
                    }
                    }
            }
System.out.println((byte)(bt1.length+bt2.length-c));

    }
	}
	