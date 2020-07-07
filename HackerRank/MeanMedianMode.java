import java.io.*;
import java.util.*;

public class MeanMedianMode {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int[] num=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            num[i]=r.nextInt();
        }
    float sum=0.0f;
      for(i=0;i<n;i++)
      {
          sum=sum+num[i];
      }
      float mean=(float)(sum/n);
      int j;
      int temp;
      for(i=0;i<n-1;i++)
      {
          for(j=i;j<n;j++)
          {
              if(num[i]>num[j])
              {
                  temp=num[i];
                  num[i]=num[j];
                  num[j]=temp;
              }
          }
      }
      float median;
          if(n%2==0)
          {
              median=(float)((num[n/2]+num[(n/2)-1])/2.0f);
          }
          else
          {
              median=num[n/2];
          }
          Vector<Integer> v=new Vector<Integer>();
          for(i=0;i<n-1;i++)
          {
              if(num[i]!=num[i+1])
              {
                  v.add(num[i]);
              }
          }
          v.add(num[n-1]);
          int c=0;
          int max=0;
          int mode=0;
          for(i=0;i<v.size();i++)
          {
              for(j=0;j<n;j++)
              {
                  if(v.get(i)==num[j])
                  {
                      c++;
                  }
              }
			  if(c==max)
			  {
				  if(v.get(i)<mode)
					  mode=v.get(i);
			  }
					  
              if(c>max)
              {
				  System.out.println(c+"c");
				  System.out.println(v.get(i));
                   max=c;
				   mode=v.get(i);
				   
              }
			  
              c=0;
          }
          System.out.println(mean+"\n"+median+"\n"+mode);
          
      }
        
    }

