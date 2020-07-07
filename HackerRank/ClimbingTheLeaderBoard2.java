import java.util.*;
class ClimbingTheLeaderBoard2
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int[] std=new int[n];
int i;
for(i=0;i<n;i++)
std[i]=r.nextInt();
int m=r.nextInt();
int[] score=new int[m];
for(i=0;i<m;i++)
score[i]=r.nextInt();
int[] rank=new int[n];
int t=std[0];
int rk=1;
for(i=0;i<n;i++)
{
if(std[i]==t)
{
rank[i]=rk;
t=std[i];
}
else
{
rk++;
rank[i]=rk;
t=std[i];
}
}
for(i=0;i<m;i++)
{
	for(int j=n-1;j>=0;j--)
	{
		if(score[i]<std[j])
		{
			System.out.println(rank[j]+1);
			break;
		}
		if(score[i]==std[j])
		{
			System.out.println(rank[j]);
			break;
		}
		if(score[i]>std[1])
		{
			System.out.println(rank[0]);
			break;
		}
		
	}
}
}
}