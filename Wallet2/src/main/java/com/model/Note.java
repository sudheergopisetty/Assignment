package com.model;

public class Note {

	private int denomination;
	private int mintDate;

	public Note(int denomination, int mintDate) {
		this.denomination = denomination;
		this.mintDate = mintDate;
	}

	public Note() {
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
