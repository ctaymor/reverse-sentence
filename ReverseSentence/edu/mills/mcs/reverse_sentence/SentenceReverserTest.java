package edu.mills.mcs.reverse_sentence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SentenceReverserTest extends SentenceReverser {
	SentenceReverser reverser = new SentenceReverser();
	
	@Test
	public void testReverseSentenceWithEmptyString() {
		String inputString ="";
		assertEquals("" , reverser.reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceMethodForRemovingPunctuation() {
		String inputString =".,()";
		assertEquals("", reverser.reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithPunctuationAsItsOwnWord() {
		String inputString ="The cat is a . fish.";
		assertEquals("fish a is cat the", reverser.reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithSingleWordAndNoPunctuation() {
		String inputString ="fish";
		assertEquals("fish", reverser.reverseSentence(inputString));
	}

	@Test
	public void testReverseSentenceWithMultipleWordsAndNoPunctuation() {
		String inputString ="One fish two fish";
		assertEquals("fish two fish one", reverser.reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithMultipleWordsAndPunctuation() {
		String inputString ="One fish, two fish, red fish, blue fish.";
		assertEquals("fish blue fish red fish two fish one", reverser.reverseSentence(inputString));
	}
}
