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
		SentenceReverser reverser = new SentenceReverser();
		
		while (true) {
			System.out.println("Enter a sentence to reverse (or 'quit' to quit): ");
			String input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
			}
			System.out.println(reverser.reverseSentence(input));
		}
	}
	
	/**
	* Returns parameter reversed word-wise with punctuation
	* removed.
	* 
	* @param s the sentence to be reversed
	* @return the reversed sentence
	*/
    public String reverseSentence(String s) {
		if(!s.isEmpty()) {
			String finalString = "";

			// Remove punctuation and multiple spaces.
			s = s.replaceAll("[^a-zA-Z ]", "").toLowerCase();
			s = s.replaceAll(" +", " ");
			
			// Reverse the sentence.
			String words[] = s.split(" ");
			for (int i = words.length-1; i >= 0; i--) {
				if (i == 0){
					finalString += words[i];
				} else {
					finalString += words[i] + " ";
				}
			}
			return finalString;
		} else {
		    // The input was the empty string.
			return s;
		}
	}
}
