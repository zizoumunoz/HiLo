import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// makes new "myScan" scanner.
		Scanner myScan = new Scanner(System.in);

		// makes new empty string "playAgain"
		String playAgain = "";

		// starts do-while loop
		do {
			// generates random integer "theNumber" between 1 and 100
			int theNumber = (int) (Math.random() * 1_000 + 1);

			// System.out.println(theNumber);

			int guess = 0;

			// nested while loop with game logic
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 1,000");
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

			// condition for do-while statement
		} while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Thank you for playing!");

		// closes myScan resource
		myScan.close();
		// Finished on page 37
	}

}
