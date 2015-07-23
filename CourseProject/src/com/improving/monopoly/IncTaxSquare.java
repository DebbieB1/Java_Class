package com.improving.monopoly;

public class IncTaxSquare extends Square {
	public IncTaxSquare() {
		super("Income Tax");
	}

	@Override
	public void landOnBy(Player player) {
		if (player.getMoney() > 2000) {
			player.debit(200);
		} else {
			int money = (int) (player.getMoney() * 0.1);
			player.debit(money);
		}
	}
}
