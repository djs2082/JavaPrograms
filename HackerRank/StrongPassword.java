

/*

Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
Input Format

The first line contains an integer  denoting the length of the string.

The second line contains a string consisting of  characters, the password typed by Louise. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

Constraints

Output Format

Print a single line containing a single integer denoting the answer to the problem.

Sample Input 0

3
Ab1
Sample Output 0

3
Explanation 0

She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.

 characters aren't enough since the length must be at least .

Sample Input 1

11
#HackerRank
Sample Output 1

1
Explanation 1

The password isn't strong, but she can make it strong by adding a single digit.


*/






















import java.util.*;
class StrongPassword
{
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		String s=r.next();
		int i;
		int c=0;
		/*if(n<6)
		{
			System.out.println(6-n);
			return;
		}
		*/
		byte[] bt=new byte[s.length()];
		bt=s.getBytes();
		boolean[] b=new boolean[4];
		for(i=0;i<4;i++)
		{
			b[i]=false;
		}
		for( i=0;i<bt.length;i++)
		{
			if(bt[i]>=48 && bt[i]<=57)
			{
				b[0]=true;
				System.out.println(b[0]+" "+0);
				continue;
			}
			if(bt[i]>=97 && bt[i]<=122)
			{
				b[1]=true;
				System.out.println(b[1]+" "+1);
				continue;
			}
			if(bt[i]>=65 && bt[i]<=97)
			{
				b[2]=true;
				System.out.println(b[2]+" "+2);
			continue;
			}
			if(bt[i]>0 && bt[i]<48)
			{
				b[3]=true;
				System.out.println(b[3]+" "+3);
				continue;
			}
			
		}
		for(i=0;i<4;i++)
		{
			if(b[i]==false)
			{	c++;
			}
		}
		if(n<6)
		{
			if((6-n)>c)
				System.out.println(6-n);
			else
				System.out.println(c);
		}
        else
        System.out.println(c);
	}
}
		
		
			
			