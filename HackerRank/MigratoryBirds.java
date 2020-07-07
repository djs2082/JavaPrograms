import java.util.*;
class MigratoryBirds
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int n=r.nextInt();
int [] id=new int[n];
int i;
int j;
int c=0;
for(i=0;i<n;i++)
id[i]=r.nextInt();

int max=0;
int idf=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(id[i]==id[j])
c++;
}

if(c==max)
{
 if(id[i]<idf) 
idf=id[i];

}
if(c>max)
{
	max=c;
idf=id[i];
	 
}
c=0;
}

System.out.println(idf);
}
}


