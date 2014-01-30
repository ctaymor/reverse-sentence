package edu.mills.mcs.reverse_sentence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceReverserTest extends SentenceReverser {
	
	@Test
	public void testReverseSentenceWithEmptyString() {
		String inputString ="";
		assertEquals("" , reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithNoWordsJustPunctuation() {
		String inputString =".,()";
		assertEquals("", reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithPunctuationAsItsOwnWord() {
		String inputString ="The cat is a . fish.";
		assertEquals("fish a is cat the", reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithSingleWordAndNoPunctuation() {
		String inputString ="fish";
		assertEquals("fish", reverseSentence(inputString));
	}

	@Test
	public void testReverseSentenceWithMultipleWordsAndNoPunctuation() {
		String inputString ="One fish two fish";
		assertEquals("fish two fish one", reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithMultipleWordsAndPunctuation() {
		String inputString ="One fish, two fish, red fish, blue fish.";
		assertEquals("fish blue fish red fish two fish one", reverseSentence(inputString));
	}
}
