import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class SaveThePrisoner {

    public static void main(String args[])
	
     {
		 Scanner r=new Scanner(System.in);
		 int[] n=new int[100];
		 int[] m=new int[100];
		 int[] s=new int[100];
		 int i;
		 for(i=0;i<100;i++)
		 {
         n[i]=r.nextInt();
		 m[i]=r.nextInt();
		 s[i]=r.nextInt();
		 }
		 /*int n=r.nextInt();
		 int m=r.nextInt();
		 int s=r.nextInt();
     */for(i=0;i<100;i++)
        System.out.println((m[i]%n[i]-1)+s[i]);
	  


    }
 }

    