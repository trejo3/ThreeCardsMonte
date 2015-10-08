import java.util.Random;
import java.util.Scanner;

public class ThreeCardsMonte 
{
	public int pickCard()
	{
		Random r = new Random();
		int secretNum = 1 + r.nextInt(3);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash. \nHe glances at you out of the corner of his eye and starts shuffling");
		System.out.println("He lays down three cards.");
		
		return secretNum;
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
		
		guess = keyboard.nextInt();
		
		keyboard.close();
		
		return guess;
	
	}
	
	public void checkGuess()
	{
		int correctCard = pickCard();
		int guessedCard = guess();
		
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
		}
			
	}
	
}
