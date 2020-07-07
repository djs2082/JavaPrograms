


















import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        int lt;
        if(a.length()>b.length())
        {
lt=a.length();
        }
        else
        {
            lt=b.length();
        }
        byte[] c1=new byte[lt];
        byte[] c2=new byte[lt];
        c1=a.getBytes();
        c2=b.getBytes();
        int i;
        int j;
        byte t;
        boolean bt=true;
        


for(i=0;i<lt;i++)
        {
            if(c1[i]<97 && c1[i]>0)
            c1[i]=(byte)(c1[i]+32);
            if(c2[i]<97 && c2[i]>0)
            c2[i]=(byte)(c2[i]+32);
        }


        
        for(i=0;i<lt-1;i++)
        {
            for(j=i;j<lt;j++)
            {
                if(c1[i]<c1[j])
                {
                    t=c1[i];
                    c1[i]=c1[j];
                    c1[j]=t;


                }
            }
        }
        for(i=0;i<lt-1;i++)
        {
            for(j=i;j<lt;j++)
            {
                if(c2[i]<c2[j])
                {
                    t=c2[i];
                    c2[i]=c2[j];
                    c2[j]=t;
                }
            }
        }
        
        for(i=0;i<lt;i++)
        {
            if(c1[i]!=c2[i])
            {
                bt=false;
                break;
            }
        }
        return bt;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



