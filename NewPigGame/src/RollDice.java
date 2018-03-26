import java.util.Scanner;

public class RollDice
{
	
		int player1Total=0, player2Total=0, winScore=50, flagScore=20;
		
	
	
	public void rollDice()
	{
		int rolledNumber1, flagScore, totalScore1, rolledNumber2, totalScore2;
		boolean hold=false;
		Scanner src=new Scanner(System.in);
		String holdResponse="";
		flagScore=20;
		totalScore1=0;
		totalScore2=0;
		System.out.println("Do you want to hold(Y/N)");
		holdResponse=src.next();
		hold=holdResponse=="Y"?true:false;
		do
		{
			rolledNumber1=(int)(Math.random()*6+1);
			if(rolledNumber1!=1)
			{
				totalScore1=totalScore1+rolledNumber1;
				System.out.println("For Player 1 Number after rolling "+rolledNumber1);
			}
			else 
				{
					System.out.println("Rolled 1");
					break;
				}
			//break;
		}while(totalScore1<flagScore&&!hold);
		
		
	}
	public int Player1(int totalScore)
	{
		int rolledNumber1, totalScore1;//, rolledNumber2, totalScore2;flagScore
		//flagScore=20;
		boolean hold=false;
		Scanner src=new Scanner(System.in);
		totalScore1=0;
		String holdResponse="N";
		//totalScore2=0;
		System.out.println("Player1 Do you want to hold(Y/N)");
		if(src.hasNext())
		{
			holdResponse=src.next();
		}
		hold=holdResponse=="Y"?true:false;
		do
		{
			rolledNumber1=(int)(Math.random()*6+1);
			if(rolledNumber1!=1)
			{
				totalScore1=totalScore1+rolledNumber1;
				System.out.println("For Player 1 Number after rolling "+rolledNumber1);
				System.out.println("Player1 Do you want to hold(Y/N)");
				holdResponse=src.next();
				hold=holdResponse=="Y"?true:false;
				/*player1Total=player1Total+totalScore1;
				System.out.println(player1Total);*/
			}
			else 
				{
					System.out.println("Player 1 Rolled 1");
					return 0;
					//break;
				}
			//break;
		}while(totalScore1<flagScore&&(totalScore1+totalScore<winScore)&&!hold);
		System.out.println("Player 1:Turn score "+totalScore1);
		return totalScore1;
	}

	public int Player2(int totalScore)
	{
		//int flagScore, 
		int rolledNumber2, totalScore2;
		Scanner src=new Scanner(System.in);
		//flagScore=20;
		//totalScore1=0;
		totalScore2=0;
		boolean hold=false;
		//totalScore1=0;
		String holdResponse="";
		//totalScore2=0;
		System.out.print("Player2 Do you want to hold(Y/N)");
		if(src.hasNext())
		{
		holdResponse=src.next();}
		hold=holdResponse=="Y"?true:false;
		do
		{
			rolledNumber2=(int)(Math.random()*6+1);
			if(rolledNumber2!=1)
			{
				totalScore2=totalScore2+rolledNumber2;
				System.out.println("For Player 2 Number after rolling "+rolledNumber2);
				System.out.println("Player2 Do you want to hold(Y/N)");
				holdResponse=src.next();
				hold=holdResponse=="Y"?true:false;
				//System.out.println("Total score "+totalScore2);
				//player2Total=player2Total+totalScore2;
				//System.out.println(player2Total);
			}
			else 
			{
				System.out.println("Player 2 Rolled 1");
				return 0;
				//break;
			}
		}while(totalScore2<flagScore&&(totalScore2+totalScore<winScore)&&!hold);
		//System.out.println("Player 1:Total score "+totalScore1);
		System.out.println("Player 2:turn score "+totalScore2);
		return totalScore2;
	}
	public int Player1()
	{
		int rolledNumber1, totalScore1;//, rolledNumber2, totalScore2;flagScore
		//flagScore=20;
		totalScore1=0;
		//totalScore2=0;
		do
		{
			rolledNumber1=(int)(Math.random()*6+1);
			if(rolledNumber1!=1)
			{
				totalScore1=totalScore1+rolledNumber1;
				System.out.println("For Player 1 Number after rolling "+rolledNumber1);
				/*player1Total=player1Total+totalScore1;
				System.out.println(player1Total);*/
			}
			else 
				{
					System.out.println("Player 1 Rolled 1");
					return 0;
					//break;
				}
			//break;
		}while(totalScore1<flagScore);
		System.out.println("Player 1:Turn score "+totalScore1);
		return totalScore1;
	}
}
