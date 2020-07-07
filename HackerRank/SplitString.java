import java.util.*;
class SplitString
{
public static void main(String args[])
{
	int i;
Scanner r=new Scanner(System.in);
Vector<Integer> v=new Vector<Integer>();
String s=r.nextLine();
StringBuffer sb=new StringBuffer(s);
byte[] bt=s.getBytes();

for(i=0;i<bt.length;i++)
{
	if(bt[i]<65)
	{
		v.add(i);
	}
	
}
for(i=0;i<v.size()-1;i++)
{
	if(v.get(i+1)-v.get(i)==1)
	{
		v.remove(i+1);
		sb.deleteCharAt(i);
	}
}
for(i=0;i<v.size();i++)
{
	System.out.println(v.get(i));
}

for(i=0;i<v.size();i++)
{
	sb.replace(v.get(i),v.get(i)+1,"0");
}

s=sb.toString();
System.out.println(s);
String[] s1=s.split("0");
System.out.println(s1.length);
for(String s2:s1)
{
	System.out.println(s2);
}


/*int start=0;
int end=0;
String s1;
for(i=0;i<v.size();i++)
{
	end=v.get(i);
	s1=s.substring(start,end);
	System.out.println(s1+""+start+" "+end);
	start=end+1;
}
	*/
/*String[] s1=s.split(" ");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
System.out.println(s);
s1=s.split(",");
 s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}

s1=s.split("!");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s1=s.split("?");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s1=s.split(".");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s1=s.split("_");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s1=s.split("'");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s1=s.split("@");
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}
s="0";
for(i=0;i<s1.length;i++)
{
	s=s+s1[i];
}

for(i=0;i<s1.length;i++)
{
	System.out.println(s1[i]);
}
*/
}
}