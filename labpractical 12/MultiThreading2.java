import java.util.*;
class Player1 extends Thread
{
	
int run;
static int score=0;
String player1;
String player1o;
 Player1(String player1)
{
	this.player1=player1;
	player1o=player1;
	int l=10-player1.length();
	for(int i=0;i<l;i++)
		this.player1=this.player1+" ";
}

public void run()
{
	
String s="012346";
for(int i=0;i<6;i++)
{
	try
	{
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
	}
run=Integer.parseInt(Character.toString(s.charAt((int)((Math.random()*6)))));

if(run==0)
{

System.out.println("wicket," +player1o+" is out with score="+score);	

break;
}
score=score+run;
if(run==4)
{

System.out.println(player1+"  "+run+"     "+score+"  wow! Its a boundary");

}
else if(run==6)
{
	
System.out.println(player1+"  "+run+"    "+score+"    wow!  Its a maximum");
    
}
else
{
System.out.println(player1+"  "+run+"     "+score);
}

}
System.out.println(player1o+" score is: "+score);
}
}
class Player2 extends Thread
{
	
int run;
static int score=0;
String player2;
String player2o;
Player2(String player2)
{
	this.player2=player2;
	player2o=player2;
	int l=10-player2.length();
	for(int i=0;i<l;i++)
		this.player2=this.player2+" ";
}
public void run()
{
	
String s="012346";
for(int i=0;i<6;i++)
{
	
	try
	{
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
	}
run=Integer.parseInt(Character.toString(s.charAt((int)((Math.random()*6)))));

if(run==0)
{

System.out.println("wicket," +player2o+" is out with score="+score);	

break;
}
score=score+run;
if(run==4)
{

System.out.println(player2+"  "+run+"     "+score+"  wow! Its a boundary");

}
else if(run==6)
{
	
System.out.println(player2+"  "+run+"     "+score+"  wow! Its a maximum");
    
}
else{

System.out.println(player2+"  "+run+"     "+score);
}

}
System.out.println(player2o+" score is: "+score);
}
}

class MultiThreading2
{
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Player1s Name: ");
	String player1=scan.next();
	System.out.println("Enter Player2s Name: ");
	String player2=scan.next();
	
Player1 t1=new Player1(player1);
Player2 t2=new Player2(player2);


System.out.println("Player    runs   score");

t1.start();
t2.start();

}
}

