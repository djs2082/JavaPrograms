import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class PickingNumbers
{
public static void main(String args[])
{
	Scanner r=new Scanner(System.in);
	int n=r.nextInt();
	boolean bt=false;
	Vector<Integer> v1=new Vector<Integer>();
	int i;
	int j;
	int temp;
	int[] a=new int[n];
	
	
	for(i=0;i<n;i++)
	{
		v1.add(r.nextInt());
	}
	Vector<Integer> v2=new Vector<Integer>();
	for(i=0;i<n-1;i++)
	{
		if(v1.get(i)==v1.get(i+1))
		{
			v2.add(v1.get(i));
			v2.add(v1.get(i+1));
			v1.remove(i);
			v1.remove(i);
			break;
		}
	}
	
	for(i=0;i<v1.size();i++)
	{
		for(j=0;j<v2.size();j++)
		{
			if((v1.get(i)-v2.get(j)<=1 && v1.get(i)-v2.get(j)>=-1)==false)
			{
				bt=true;
				break;
			}
		}
		if(bt==true)
		{bt=false;
	continue;
	
		}
		else
		{
			v2.add(v1.get(i));
		}
			
		
	}
	
	System.out.println(v2.size());
	}
	
}
