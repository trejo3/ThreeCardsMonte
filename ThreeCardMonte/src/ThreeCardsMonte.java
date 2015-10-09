import java.util.Random;
import java.util.Scanner;

public class ThreeCardsMonte 
{
	public int pickCard()
	{
		Random r = new Random();
		int correctCard = 1 + r.nextInt(3);
		
		return correctCard;
	}
	
	public int guess(Scanner input)
	{	
		int guess;
		
		System.out.println("");
		System.out.println("Which one is the ace?");
		System.out.println("");
		System.out.println("");
		System.out.println("      ##  ##  ##   ");
		System.out.println("      ##  ##  ##   ");
		System.out.println("      1   2   3    ");	

		guess = input.nextInt();
		
		return guess;	
	}
	

	
	public boolean checkGuess(int correctCard, int guessedCard)
	{
		
		if (correctCard == guessedCard)
		{
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings.");
			
			if (correctCard == 1)
			{
				System.out.println("");
				System.out.println("      AA  ##  ##   ");
				System.out.println("      AA  ##  ##   ");
				System.out.println("      1   2   3    ");
			}
			else if (correctCard == 2)
			{
				System.out.println("");
				System.out.println("      ##  AA  ##   ");
				System.out.println("      ##  AA  ##   ");
				System.out.println("      1   2   3    ");
			}
			else if (correctCard == 3)
			{
				System.out.println("");
				System.out.println("      ##  ##  AA   ");
				System.out.println("      ##  ##  AA   ");
				System.out.println("      1   2   3    ");
			}
			return true;
		}
		else
		{
			
			if (correctCard == 1)
			{
				System.out.println("Ha! Fast Eddie wins again! The ace was card number 1.");
				System.out.println("");
				System.out.println("      AA  ##  ##   ");
				System.out.println("      AA  ##  ##   ");
				System.out.println("      1   2   3    ");
			}
			else if (correctCard == 2)
			{
				System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.");
				System.out.println("");
				System.out.println("      ##  AA  ##   ");
				System.out.println("      ##  AA  ##   ");
				System.out.println("      1   2   3    ");
			}
			else if (correctCard == 3)
			{
				System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.");
				System.out.println("");
				System.out.println("      ##  ##  AA   ");
				System.out.println("      ##  ##  AA   ");
				System.out.println("      1   2   3    ");
			}
			return false;
		}
			
	}
	
	public int letBet(Scanner input)
	{
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash. \nHe glances at you out of the corner of his eye and starts shuffling");
		System.out.println("He lays down three cards.");
		
		int bet = 0;
		do{
			System.out.println("");
			System.out.println("\"Place your bet\" he says...");
			bet = input.nextInt();
		
			if (bet < 5) {System.out.println("I need 5 bucks minimum man");}
		}while (bet<5);

		return bet;
	}
	
	public int processBet(int balance, int bet, boolean win)
	{
		balance = balance - bet;

		if (win == true)
		{
			balance = balance + (bet*2);
		}
		else if (win == false)
		{
			balance = balance - bet;
		}
		System.out.println("");	
		System.out.println("Your balance: " + balance);
		System.out.println("");	
		
			return balance;
	}
}
