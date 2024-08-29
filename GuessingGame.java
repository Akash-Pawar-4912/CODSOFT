package DEMO;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String [] args) {
		Scanner scanner= new Scanner(System.in);
		Random random=new Random();
		
		int min=1;
		int max=100;
		int maxAttempts=10;
		int score=0;
		
		String playAgain;
		do {
			int randomNumber=random.nextInt(max-min+1)+min;
			int attempts=0;
			boolean hasGuessedCorrectely=false;
			
			System.out.println("I have generated random Number between" + min + " And " + max + ".");
			
			System.out.println("Can you guess what it is ? You have" + maxAttempts + " attempts.");
			
			while(attempts < maxAttempts && ! hasGuessedCorrectely)
			{
				System.out.println("Enter your guess :");
				int userGuess= scanner.nextInt();
				 attempts++;
				 
				 if(userGuess==randomNumber)
				 {
					 System.out.println("Congratulation ! You gaussed the correct number :" +randomNumber);
					 
					 hasGuessedCorrectely=true;
					 
					 score+=maxAttempts-attempts+1;
					 
				 }
				 else if (userGuess >randomNumber)
				 {
					 System.out.println("Too high");
				 }
				 else
				 {
					 System.out.println("Too low");
				 }
				
			}
			
			if (!hasGuessedCorrectely) 
			{
				System.out.println("Sorry, you're used all "+ maxAttempts + " attempts. The correct number was " + randomNumber);
				
			}
			System.out.println("Do you want to play again? (yes/no):");
			
			playAgain =scanner.next();
			
		}
		while(playAgain.equalsIgnoreCase("yes"));
		
		System.out.println("Your total Score :" +score);
		
		scanner.close();
		
		
		
		}
	}


