import java.util.*;
class ClimbingTheLeaderBoard
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int[] std=new int[n];
int i;
int c=0;
boolean b=true;
for(i=0;i<n;i++)
{
std[i]=r.nextInt();
}
int m=r.nextInt();
int[] score=new int[m];
for(i=0;i<m;i++)
{
score[i]=r.nextInt();
}
Vector<Integer> v=new Vector<Integer>();

for(i=0;i<n-1;i++)
{
if(std[i]!=std[i+1])
{
v.add(std[i]);
c++;

}
}
v.add(std[n-1]);

for(i=0;i<m;i++)
{
for(int j=0;j<v.size();j++)
{
if(score[i]>v.get(j))
{
	System.out.println((j+1)+">");
	b=false;
break;
}
else if(score[i]==v.get(j))
{
	System.out.println((j+1)+"=");

b=false;
break;
}

}
if(b==true)
{
	System.out.println(v.size()+1+"<");
}
}

}
}
