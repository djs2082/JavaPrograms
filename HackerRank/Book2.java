import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


   class Book2
   {
       public static void main(String args[])
       {
           Scanner r=new Scanner(System.in);
           int fp;
           int lp;

                      


           int n=r.nextInt();
           int p=r.nextInt();
           if(n%2==0)
           {
if(p%2==0)
           {
               fp=p/2;
               lp=(n-p)/2;
           }
           else
           {
           fp=(p-1)/2;
           lp=((n-p)+1)/2;
           }
           }
           else
           {
              if(p%2==0)
           {
               fp=p/2;
               lp=(n-p-2)/2+1;
           }
           else
           {
           fp=(p-1)/2;
           lp=(n-p)/2;
           }
                      }
           

           /*
           if(p%2==0)
           {
               fp=p/2;
           }
           else
           fp=(p-1)/2;
           if((n-p)%2==0)
           {
               lp=(n-p)/2;
           }
           
           
           else
           lp=(n-p-1)/2;
           */
           if(lp>=fp)
           System.out.println(fp);
           else
           System.out.println(lp);

       }
   }
