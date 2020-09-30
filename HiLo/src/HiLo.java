import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String playAgain = "";
		do {
			int theNumber = (int) (Math.random() * 100 + 1);
			//		System.out.println(theNumber);
			int guess = 0;

			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100");
				guess = myScan.nextInt();
				System.out.println("You entered " + guess + ".");
				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else
					System.out.println(guess + " is correct. You win!");
			}

			// do-while loop to let user loop game
			System.out.println("Would you like to play again (y/n)?");
			playAgain = myScan.next();

		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing!");
		myScan.close();
		// Finished on page 37
	}

}
