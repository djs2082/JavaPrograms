import java.util.*;
class StringReduce
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
String s=r.next();
int[] dt=new int[s.length()];
char[] ch=new char[s.length()];
StringBuffer sb=new StringBuffer(s);
ch=s.toCharArray();
int i;
for(i=0;i<s.length()-1;i++)
{
for(int j=i+1;j<sb.length();j++)
{
if(ch[i]==ch[j])
{
sb.deleteCharAt(j);
j--;
System.out.println(ch[j]+" "+j);

}
}
}

/*for(i=0;i<dt.length;i++)
{
sb.deleteCharAt(dt[i]);

}
*/
System.out.println(sb);
}
}
