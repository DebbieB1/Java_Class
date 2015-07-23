package com.improving.monopoly;

import com.improving.dice.Die;

public class Player implements IPlayer {

	private Tokens token;
	private int money;
	private Square location;
	private int steps;

	public Player(Tokens token, int money, Square location) {
		this.token = token;
		this.money = money;
		this.location = location;

	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getToken()
	 */
	@Override
	public Tokens getToken() {
		return token;
	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getMoney()
	 */
	@Override
	public int getMoney() {
		return money;
	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getLocation()
	 */
	@Override
	public Square getLocation() {
		return location;
	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getLastRoll()
	 */
	@Override
	public int getLastRoll() {
		return steps;
	}

	public void takeTurn(Die die1, Die die2) {
		die1.roll();
		die2.roll();

		steps = die1.getFaceValue() + die2.getFaceValue();

		for (int i = 0; i < steps; i++) {
			location = location.getNextSquare();
			location.passOverBy(this);
		}
		location.landOnBy(this);

	}

	public void credit(int amount) {
		money += amount;
	}

	public void debit(int amount) {
		money -= amount;

	}
}
