import java.io.*;
import java.util.*;
import java.text.*;

public class WeightedMean {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
    int[] x=new int[n];
    int[] w=new int[n];
       int i;
        for(i=0;i<n;i++)
        {
x[i]=r.nextInt();
        }
        for(i=0;i<n;i++)
        {
            w[i]=r.nextInt();
        }
       double sum=0;
        double wsum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+x[i]*w[i];
			
            wsum=wsum+w[i];
			System.out.println(sum+"sum"+" "+wsum+"wsum");
        }
		System.out.println(sum+"sum"+" "+wsum+"wsum");
         double ans=(sum/wsum);
		 System.out.println(ans);
		 System.out.println(Math.round(ans));
        DecimalFormat df=new DecimalFormat("#.#");
        
		
		ans=Math.round(ans*10)/10.0f;
        System.out.println(df.format(ans));
		
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
