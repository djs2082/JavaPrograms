import java.util.*;
class CutTheSticks
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();

int[] arr=new int[n];

        int i=0;
       
        int c=0;
        int j=0;
		for(i=0;i<n;i++)
		arr[i]=r.nextInt();
	int t=arr[n-1];
	int min;
Vector<Integer> v=new Vector<Integer>();
v.add(arr.length);
c=5;
while(c>0)
{
    c=0;
    min=t;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
            if(arr[i]<min)
            min=arr[i];
            }
        }
		System.out.println(min);

        
        for(i=0;i<arr.length;i++)
        {
            
            arr[i]=arr[i]-min;
            if(arr[i]>0)
            {
                c++;
				t=arr[i];
            }
        }
        v.add(c);
		System.out.println(c+"cin");
}
System.out.println(c+"c");
for(i=0;i<v.size();i++)
{
v.get(i);
}
}
}

