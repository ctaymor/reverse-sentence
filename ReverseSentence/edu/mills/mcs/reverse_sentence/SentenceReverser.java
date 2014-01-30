package edu.mills.mcs.reverse_sentence;

import java.util.Scanner;

/**
 * Program to reverse sentences entered by the user.  This exists to get practice with
 * JUnit and EGit.
 * 
 * @author ellen.spertus@gmail.com (Ellen Spertus)
 * @author ctaymor@gmail.com (Caroline Taymor)
 */
public class SentenceReverser {
	/**
	 * Solicits sentences from the user, printing each one back to standard output
	 * with the words reversed and punctuation omitted.  The program can be exited
	 * by entering "quit".
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		outerloop:
		while (true) {
			System.out.println("Enter a sentence to reverse (or 'quit' to quit): ");
			String input = scanner.nextLine();
			if (input.equals("quit")) {
				break outerloop;
			}
			// TODO: Leave loop if user entered "quit".
			// Unsure what ellen wants us to do to leave the loop, does she mean break all loops

			System.out.println(reverseSentence(input));
		}
	}
	
	/**
	 * Returns input <code>String</code> reversed word-wise with punctuation
	 * removed.
	 * 
	 * @param s the sentence to be reversed
	 * @return the reversed sentence as a <code>String</code>
	 */
    public static String reverseSentence(String s) {//TODO having the problem with this being static again
		if(s != ""){
			String finalString = "";

			// Remove punctuation
			s = s.replaceAll("[^a-zA-Z ]", "").toLowerCase();
			/* When the string contains " . " or any other punctuation for the period,
			*  it was creating a double space. The following line catches that. It does not,
			*  however, fix the problem in the unlikely yet possible case of " . . ". In that case,
			   there would still be two or more spaces.*/
			s = s.replaceAll("  ", " ");
			
			// Reverse the sentence
			String words[] = s.split(" ");
			for (int i = words.length-1; i >= 0; i--){
				if(words[i].equals(" ")){
					words[i] = "";
				};
				if (i == 0){
					finalString = finalString + words[i];
				} else {
					finalString = finalString + words[i] + " ";
				}
			}
			return finalString;
		// If you get here, then the input string was an empty string
		} else {
			return s;
		}
	}
}
