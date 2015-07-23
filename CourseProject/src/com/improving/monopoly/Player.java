package com.improving.monopoly;

import com.improving.dice.Die;

public class Player {

	private Tokens token;
	private int money;
	private Square location;
	private int steps;
	

	public Player(Tokens token, int money, Square location) {
		this.token = token;
		this.money = money;
		this.location = location; 

	}

	public Tokens getToken() {
		return token;
	}

	public int getMoney() {
		return money;
	}

	public Square getLocation() {
		return location;
	}

	public int getLastRoll() {
		return steps;
	}
	public void takeTurn(Die die1, Die die2) {
		die1.roll();
		die2.roll();
		
		steps = die1.getFaceValue() + die2.getFaceValue();
		
		for (int i = 0; i < steps; i++) {
			location = location.getNextSquare();
		}
		location.landOnBy(this);
		
	}

	public void credit(int amount) { 
		money += amount;
			}
}
