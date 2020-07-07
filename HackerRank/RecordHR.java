import java.util.*;
class Score
{
private int[] s;
private int m;
private int i=0;
private int max;
private int b=0;
private int w=0;
private int j;
private int min;
Scanner r1=new Scanner(System.in);
Score(int m)
{
this.m=m;
}
void score(int[] s1)
{
this.s=s1;
}
int best()
{
max=s[0];
for(i=1;i<m;i++)
{
if(s[i]>max)
{
max=s[i];

b++;

}


}
return b;
}
int worst()
{
min=s[0];
for(i=0;i<m;i++)
{
if(s[i]<min)
{
min=s[i];
w++;

}
}
return w;
}
}
class RecordHR
{
public static void main(String args[])
{
int i;
Scanner r2=new Scanner(System.in);
int m=r2.nextInt();
Score sc=new Score(m);
int[] s=new int[m];
for(i=0;i<m;i++)
{
s[i]=r2.nextInt();
}
sc.score(s);
System.out.println(sc.best()+" "+sc.worst());
}
}