 import java.util.*;
 class Cavity
 {
 public static void main(String args[])
 {
 Scanner r=new Scanner(System.in);
 int n=r.nextInt();
 int i;
 String[] grid=new String[n];
 for(i=0;i<n;i++)
 grid[i]=r.next();
 
 
 
        int j;
        int a;
        int b;
        int c;
        int d;
        int e;
        String s="X";
		String ngrid[]=new String[n];
		ngrid[0]=grid[0];
		ngrid[n-1]=grid[n-1];
        for(i=1;i<grid.length-1;i++)
        {
            for(j=1;j<grid[i].length()-1;j++)
            {
				System.out.println(Character.toString(grid[i].charAt(j-1)));
                a=Integer.parseInt(Character.toString(grid[i].charAt(j-1)));
            c = Integer.parseInt(Character.toString(grid[i].charAt(j + 1)));
            b=Integer.parseInt(Character.toString(grid[i].charAt(j)));
            d=Integer.parseInt(Character.toString(grid[i-1].charAt(j)));
            e=Integer.parseInt(Character.toString(grid[i+1].charAt(j)));
            if(a<b && c<b && d<b && e<b)
            {
               StringBuffer sb=new StringBuffer(grid[i]);
                sb.replace(j,j+1,"X");
				System.out.println(sb);
                ngrid[i]=sb.toString();
            }
            }

        }
        for(i=0;i<n;i++)
		System.out.println(ngrid[i]);


    }
	}
	