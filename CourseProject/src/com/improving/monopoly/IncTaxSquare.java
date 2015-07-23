package com.improving.monopoly;

public class IncTaxSquare extends Square {
	public IncTaxSquare() {
		super("Income Tax");
	}

	@Override
	public void landOnBy(Player player) {
		/*
		 * if (player.getMoney() > 2000) {
		 * 
		 * player.debit(200); } else { int money = (player.getMoney()/10);
		 * player.debit(money); }
		 */
		// this function returns the minimum of two values passed in
		// so the lesser of 10% or $200 is subtracted from the player
		int amount = Math.min(player.getMoney()/10, 200);
		player.debit(amount); 
	}
}
