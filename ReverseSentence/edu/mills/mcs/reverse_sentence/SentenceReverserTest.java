package edu.mills.mcs.reverse_sentence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceReverserTest extends SentenceReverser {

	@Test
	public void testReverseSentence() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testReverseSentenceWithEmptyString() {
		String inputString ="";
		assertEquals("", reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithNoWordsJustPunctuation() {
		String inputString =".,()";
		assertEquals("", reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithSingleWordAndNoPunctuation() {
		String inputString ="fish";
		assertEquals("fish", reverseSentence(inputString));
	}

	@Test
	public void testReverseSentenceWithMultipleWordsAndNoPunctuation() {
		String inputString ="One fish two fish";
		assertEquals("fish two fish One", reverseSentence(inputString));
	}
	
	@Test
	public void testReverseSentenceWithMultipleWordsAndPunctuation() {
		String inputString ="One fish, two fish, red fish, blue fish.";
		assertEquals("fish blue fish red fish two fish One", reverseSentence(inputString));
	}
}
