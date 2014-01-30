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
			// TODO: Unsure what ellen wants us to do to leave the loop, does she mean break all loops

			System.out.println(reverseSentence(input));//TODO: Check is this correct style for variable name?
		}
	}
	
	// TODO: Add JavaDoc.
	public static String reverseSentence(String s) {//TODO having the problem with this being static again
		if(s != ""){
			s = s.replaceAll("[^a-zA-Z ]","").toLowerCase();// TODO: do we want it to lowercase?
			s = s.replaceAll("  "," ");//ugly fix which only cleans up case of " . " but not " . . "
			String words[];//TODO check style guidelines on naming variables and ordering them
			String finalString;
			finalString="";//TODO check if we can declare and initialize on same line according to style guidelines
			words = s.split(" ");
			for (int i = words.length-1; i >=0; i--){ // TODO: check code guidelines for spacing on commas and = signs
				if(words[i].equals(" ")){
					words[i]="";
				};
				if (i==0){
					finalString= finalString+ words[i];
				} else {
					finalString= finalString+ words[i]+" ";
				}
			}
			return finalString;
		} else {
			return s;
		}
	}
}
