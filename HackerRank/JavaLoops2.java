
/*


We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.



*/










import java.util.*;
class JavaLoops2
{
public static void main(String args[])
{
int i;
int j;
int k=0;
Scanner r=new Scanner(System.in);
int q=r.nextInt();
int[] a=new int[q];
int[] b=new int[q];
int[] n=new int[q];
int sum=0;
for(i=0;i<q;i++)
{
a[i]=r.nextInt();
b[i]=r.nextInt();
n[i]=r.nextInt();
}
while(k<q)
{
sum=0;
for(j=0;j<n[k];j++)
{
sum=sum+(a[k]+(int)Math.pow(2,j)*b[k]);
System.out.print(sum+" ");
}
System.out.println("");
k++;
}
}
}
