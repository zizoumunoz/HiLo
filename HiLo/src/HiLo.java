import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		int theNumber = (int)(Math.random() * 100 + 1);
//		System.out.println( theNumber );
		int guess = 0;
		System.out.println("Guess a number between 1 and 100");
		guess = myScan.nextInt();
		System.out.println("You entered " + guess + ".");
	}

}
