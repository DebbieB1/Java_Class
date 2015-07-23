package com.improving.ui;

import com.improving.dice.Die;

public class DiceApp {
	public static void main(String[] args)
	{
		Die die = new Die(20);
		die.roll();
		System.out.println(die.getFaceValue());
		
		Die die2 = new Die();
		die2.roll();
		System.out.println(die2.getFaceValue());
		
						
	}

}
