package com.model;

public class Coin {

	private int denomination;
	private int mintDate;

	public Coin(int denomination, int mintDate) {
		this.denomination = denomination;
		this.mintDate = mintDate;
	}

	public Coin() {
		super();
	}

	public int getDenomination() {
		return denomination;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}

	public int getMintDate() {
		return mintDate;
	}

	public void setMintDate(int mintDate) {
		this.mintDate = mintDate;
	}
}
