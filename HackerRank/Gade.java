import java.util.*; 

class Gade

{

public static void main(String args[])

{

int i,g,n,p;

Scanner r=new Scanner(System.in);

n=r.nextInt();

int[] gr=new int[n];


for(i=0;i<n;i++)

{

gr[i]=r.nextInt();

}

for(int j=0;j<n;j++)

{

System.out.println("hii");

if(gr[j]<40)

{
System.out.println("icn");

continue;

}

{

for(i=1;i<n;i++)

{

p=5*i;
if(p>gr[j])

{

if(p-gr[j]<3)

{

gr[i]=p;


}

break;


}


}


}

}


for(i=0;i<n;i++)

{

System.out.println(gr[i]);
}


}

}


