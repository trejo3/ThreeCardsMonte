import java.util.Scanner;


public class ThreeCardMonteApp 
{
	public static void main(String[] args)
	{
		
		// Create new game
		int balance = 100;
		Scanner input = new Scanner(System.in);
		
		while (balance > 0 && balance < 500)
		{
			ThreeCardsMonte myAttempt = new ThreeCardsMonte();
			
			// Dealer picks card
			int correctCard = myAttempt.pickCard();
			
			//Allow player to place bet
			int bet = myAttempt.letBet(input);
			
			// Allow player to make his guess
			int guessedCard = myAttempt.guess(input);
				
			//Check if player guessed correctly
			boolean win = myAttempt.checkGuess(correctCard, guessedCard);
			
			//Process player's bet based on result
			int newBalance = myAttempt.processBet(balance, bet, win);
			
			balance = newBalance;
		}
		if (balance < 0)
		{
			System.out.println("That is it for you, you are out of money.");
		}
		else
		{
			System.out.println("That is it for you, you've won too much.");
		}

		input.close();
	}
}
