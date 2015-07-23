package com.improving.dice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {


	@Test
	public void testRoll_MoreThan0() {
	// setup
		Die testDie = new Die();
		
	// exercise
		testDie.roll();
		
	// verify
		int value = testDie.getFaceValue();
		assertTrue(value > 0);
		
		
	}

	@Test
	public void testRoll_lessThan7() {
	// setup
		Die testDie = new Die(0);
		
	// exercise
		testDie.roll();
		
	// verify
		int value = testDie.getFaceValue();
		assertTrue(value < 7);
		
		
	}
}
