import java.lang.Math;
import java.util.Scanner;

public class PigGame 
{
	public static void main(String args[])
	{
		RollDice rd = new RollDice();
		//rd.rollDice();
		int player1=0;
		int player2=0;
		//double tt0=0.00000, tt20=0.00000, tt21=0.00000, tt22=0.00000, tt23=0.00000, tt24=0.00000, tt25=0.00000;
		//int counter0=0,counter20=0, counter21=0, counter22=0, counter23=0, counter24=0, counter25=0;
		System.out.println("Please enter number of siumulations:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//--int n= int)
		//s.close();
		
		do
		{
			
			player1=player1+rd.Player1(player1);
			System.out.println("Player 1 Cumulative Score:"+player1);
			if (player1<100)
			{
				player2=player2+rd.Player2(player2);
				System.out.println("Player 2 Cumulative Score:"+player2);
			}
		}
		while(player1<100&&player2<100);
		
			System.out.println("Player 1 Total Score:"+player1);
			System.out.println("Player 2 Total Score:"+player2);
			if(player2>player1)
			{
				System.out.println("Player 2 wins.");				
			}
			else
			{
				System.out.println("Player 1 wins.");
			}
	/*	for(int i=0;i<n;i++)
		{
			player1=rd.Player1();
			switch (player1) 
			{
	            case 0:  counter0=counter0+1;
	                     break;
	            case 20: counter20=counter20+1;
	            		break;
	            case 21: counter21=counter21+1;
	            		break;
	            case 22: counter22=counter22+1;
		   				break;
	            case 23: counter23=counter23+1;
                		break;
		       case 24: counter24=counter24+1;
		       			break;
		       case 25:  counter25=counter25+1;
		       			break;
		       
			}*/
		}
		/*tt0=(double)(counter0)/(double)n;
		tt20=(double)(counter20/100.00000);
		tt21=(double)(counter21/100.00000);
		tt22=(double)(counter22/100.00000);
		tt23=(double)(counter23/100.00000);
		tt24=(double)(counter24/100.00000);
		tt25=(double)(counter25/100.00000);*/
	/*	tt0=(double)(counter0)/(double)n;
		tt20=(double)(counter20/(double)n);
		tt21=(double)(counter21/(double)n);
		tt22=(double)(counter22/(double)n);
		tt23=(double)(counter23/(double)n);
		tt24=(double)(counter24/(double)n);
		tt25=(double)(counter25/(double)n);
		
		System.out.println("For 0 "+ tt0);
		System.out.println("For 20 "+ tt20);
		System.out.println("For 21 "+ tt21);
		System.out.println("For 22 "+ tt22);
		System.out.println("For 23 "+ tt23);
		System.out.println("For 24 "+ tt24);
		System.out.println("For 25 "+ tt25);
		
		
		System.out.println("For 0 "+ counter0);
		System.out.println("For 20 "+ counter20);
		System.out.println("For 21 "+ counter21);
		System.out.println("For 22 "+ counter22);
		System.out.println("For 23 "+ counter23);
		System.out.println("For 24 "+ counter24);
		System.out.println("For 25 "+ counter25);*/
	}
	
