import java.util.*;
import java.io.*;
class Player1 implements Runnable
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

public void run() throws IOException
{
	
String s="012346";
for(int i=0;i<6;i++)
{
System.in.read();
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
class Player2 implements Runnable
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

class Winner implements Runnable

{
	public void run()
	{
	synchronized(this)
	{
		if(Player1.score>Player2.score)
			System.out.println("Player1 is winner");
		else if(Player2.score<Player1.score)
			System.out.println("Player2 is winner");
		
	}
	}
}
class MultiThreading1 
{
public static void main(String args[]) throws IOException
{
	System.out.println("WELCOME TO BOOK CRICKET");
	System.out.println("RULES:");
	System.out.println("   *each player will be awarded 6 balls");
	System.out.println("   *if you scored 0 then you are out");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Player1s Name: ");
	String player1=scan.next();
	System.out.println("Enter Player2s Name: ");
	String player2=scan.next();
	
Player1 p1=new Player1(player1);
Player2 p2=new Player2(player2);
Winner p3=new Winner();
System.out.println("Player    runs   score");
Thread t1=new Thread(p1);
Thread t2=new Thread(p2);
Thread t3=new Thread(p3);
t1.start();
t2.start();
t3.start();
}
}

