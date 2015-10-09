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
	
	public int guess()
	{
		Scanner keyboard = new Scanner(System.in);
		int guess;
		
		System.out.println("");
		System.out.println("Which one is the ace?");
		System.out.println("");
		System.out.println("");
		System.out.println("      ##  ##  ##   ");
		System.out.println("      ##  ##  ##   ");
		System.out.println("      1   2   3    ");
		
//		if(keyboard.hasNextLine())
//		{
			
			
//		}
		guess = keyboard.nextInt();
//		keyboard.nextLine();
		
		keyboard.close();
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
			System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.");
			
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
			return false;
		}
			
	}
	
	public int letBet()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash. \nHe glances at you out of the corner of his eye and starts shuffling");
		System.out.println("He lays down three cards.");
		
		int bet = 0;
		do{
			System.out.println("");
			System.out.println("\"Place your bet\" he says...");
			bet = input.nextInt();
		
			if (bet < 5) {System.out.println("I need 5 bucks minimum man");}
		}while (bet<5);
		input.close();
		return bet;
	}
	
	public int processBet(int balance, int bet, boolean win)
	{
		balance = balance - bet;
		if (balance > 0 && balance < 500)
		{
			if (win == true)
			{
				balance = balance + (bet*2);
			}
			else if (win == false)
			{
				balance = balance - bet;
			}
			System.out.println("Your balance: " + balance);	
		}
		else if (balance < 0)
		{
			System.out.println("That is it for you, you are out of money.");
		}
		else
		{
			System.out.println("That is it for you, you've won too much.");
		}
		
		return balance;
	}
}
