import java.util.Scanner;


public class ThreeCardMonteApp 
{
	public static void main(String[] args)
	{
		
		// Create new game
		ThreeCardsMonte myAttempt = new ThreeCardsMonte();
		
		
		// Dealer picks card
		int correctCard = myAttempt.pickCard();
		
		//Allow player to place bet
		int bet = myAttempt.letBet();
		
		// Allow player to make his guess
		int guessedCard = myAttempt.guess();
		
		
		//Check if player guessed correctly
		boolean win = myAttempt.checkGuess(correctCard, guessedCard);
		
		//Process player's bet based on result
		int balance = 100;
		int newBalance = myAttempt.processBet(balance, bet, win);
		
		balance = newBalance;
	}
}
