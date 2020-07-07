




/*

Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================

*/






















import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] s1=new String[3];
            int[] x=new int[3];
            int i;
            int j;
            System.out.println("================================");
            for( i=0;i<3;i++){
                 s1[i]=sc.next();
                 x[i]=sc.nextInt();
                
            }
            for( i=0;i<3;i++)
            {
                System.out.print(s1[i]);
                if(s1[i].length()<10)
                {
                    for(j=1;j<=(10-s1[i].length());j++)
                    System.out.print(" ");
                }
                if(x[i]<100 && x[i]>=10)
               { s1[i]="0"+x[i];
                System.out.print("     "+s1[i]);
               }
               else if(x[i]<10)
               {
                   s1[i]="00"+x[i];
                   System.out.print("     "+s1[i]);

               }
               else 
               System.out.print("     "+x[i]);

                System.out.println("");
                

            }
            System.out.println("================================");

    }
}



