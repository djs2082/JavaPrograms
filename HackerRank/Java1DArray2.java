   import java.util.*;
   class Java1DArray2
   {
   public static void main(String args[])
   {
   Scanner r=new Scanner(System.in);
   int num=r.nextInt();
   int i=0;
   int leap=r.nextInt();
   int[] game=new int[num];
   for(i=0;i<num;i++)
   game[i]=r.nextInt();
   
   
    i=0;
        int n=0;
        boolean b=true;
        while(n<=game.length)
        {
            if(i+leap<game.length)
            {
                if(game[i+leap]==0)
                {
                    n=n+leap;
                    i=i+leap;
                }
                else if(i+1==0)
                {
                    n=n+1;

                }
                else
                {
                  b=false;
                  break;
                }
            }
            
            else 
            {
                b=false;
                break;
            }
        }
        if(n==game.length)
        b=true;
       
	   
	   
	   
	   System.out.println(b);
	   }
	   }