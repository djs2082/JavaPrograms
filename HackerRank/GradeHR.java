import java.util.*;
class Grade
{
private int li;
private int num;
private int value;
int i;
int grade(int gr)
{
li=(gr/5+1);
for(i=1;i<=li;i++)
{
num=5*i;


if(gr<40)
{
value=gr;
break;
}


if(num>gr)
{

if((num-gr)<3)
{
value=num;
}
else
{
value=gr;
}
}
}
return value;
}
}
class GradeHR
{
public static void main(String args[])
{
 int n;
 int value;
int i;
Scanner r=new Scanner(System.in);
n=r.nextInt();

 int[] gr=new int[n];
for(i=0;i<n;i++)
{
gr[i]=r.nextInt();
}
Grade g=new Grade();
freturn value;
value=g.grade(gr[i]);
System.out.println(value);
}
}
}



