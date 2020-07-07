import java.util.Scanner;

 class JSK
 {
   public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(s.length()-k,s.length());
     String s1;
        int j=0;
    for(int i=0;i<s.length()-(k-1);i++)
    {
        s1=s.substring(j,j+k);
        j=j+1;
        if(s1.compareTo(smallest)<0)
        {smallest=s1;
	
	
		}

        if(s1.compareTo(largest)>0)
		{
			
        largest=s1;
		}
    }
	

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}