package com.model;

public class Coin {

	private int oneRupeeCoin;
	private int twoRupeeCoin;
	private int fiveRupeeCoin;
	private int tenRupeeCoin;

	public Coin(int oneRupeeCoin, int twoRupeeCoin, int fiveRupeeCoin, int tenRupeeCoin) {
		super();
		this.oneRupeeCoin = oneRupeeCoin;
		this.twoRupeeCoin = twoRupeeCoin;
		this.fiveRupeeCoin = fiveRupeeCoin;
		this.tenRupeeCoin = tenRupeeCoin;
	}

	public int getOneRupeeCoin() {
		return oneRupeeCoin;
	}

	public void setOneRupeeCoin(int oneRupeeCoin) {
		this.oneRupeeCoin = oneRupeeCoin;
	}

	public int getTwoRupeeCoin() {
		return twoRupeeCoin;
	}

	public void setTwoRupeeCoin(int twoRupeeCoin) {
		this.twoRupeeCoin = twoRupeeCoin;
	}

	public int getFiveRupeeCoin() {
		return fiveRupeeCoin;
	}

	public void setFiveRupeeCoin(int fiveRupeeCoin) {
		this.fiveRupeeCoin = fiveRupeeCoin;
	}

	public int getTenRupeeCoin() {
		return tenRupeeCoin;
	}

	public void setTenRupeeCoin(int tenRupeeCoin) {
		this.tenRupeeCoin = tenRupeeCoin;
	}

}
