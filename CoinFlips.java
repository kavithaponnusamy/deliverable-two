import java.util.Scanner;

public class CoinFlips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String headsOrTailsGuess;
		int numberOfFlips;
		int correctCount=0;
		System.out.println("Which will have more: heads or tails? ");
		Scanner scnr = new Scanner(System.in);
		headsOrTailsGuess = scnr.next();
		System.out.println("How many times shall we flip a coin?  ");
		numberOfFlips = scnr.nextInt();
		for(int i=0; i<numberOfFlips; i++) {
			if(Math.random()<.5) {
				System.out.println("heads");
				if (headsOrTailsGuess.equalsIgnoreCase("heads")) {
					correctCount++;
				}
			}
			else
			{				
				System.out.println("tails");
				if (headsOrTailsGuess.equalsIgnoreCase("tails")) {
					correctCount++;
				}
			}
		}
		System.out.println("Your guess, "+headsOrTailsGuess+", came up "+correctCount+" time(s)");
		System.out.println("That is "+(int)(((double)correctCount/numberOfFlips)*100)+"%.");
		scnr.close();
	}
}
