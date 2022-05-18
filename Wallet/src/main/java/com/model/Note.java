package com.model;

public class Note {

	private int tenRupeeNote;
	private int twentyRupeeNote;
	private int fiftyRupeeNote;
	private int hundredRupeeNote;
	private int fiveHundredRupeeNote;

	public Note(int tenRupeeNote, int twentyRupeeNote, int fiftyRupeeNote, int hundredRupeeNote,
			int fiveHundredRupeeNote) {
		super();
		this.tenRupeeNote = tenRupeeNote;
		this.fiftyRupeeNote  = twentyRupeeNote;
		this.fiftyRupeeNote = fiftyRupeeNote;
		this.hundredRupeeNote = hundredRupeeNote;
		this.fiveHundredRupeeNote = fiveHundredRupeeNote;
	}

	public int getTenRupeeNote() {
		return tenRupeeNote;
	}

	public void setTenRupeeNote(int tenRupeeNote) {
		this.tenRupeeNote = tenRupeeNote;
	}

	public int getTwentyRupeeNote() {
		return twentyRupeeNote;
	}

	public void setTwentyRupeeNote(int twentyRupeeNote) {
		this.twentyRupeeNote = twentyRupeeNote;
	}

	public int getFiftyRupeeNote() {
		return fiftyRupeeNote;
	}

	public void setFiftyRupeeNote(int fiftyRupeeNote) {
		this.fiftyRupeeNote = fiftyRupeeNote;
	}

	public int getHundredRupeeNote() {
		return hundredRupeeNote;
	}

	public void setHundredRupeeNote(int hundredRupeeNote) {
		this.hundredRupeeNote = hundredRupeeNote;
	}

	public int getFiveHundredRupeeNote() {
		return fiveHundredRupeeNote;
	}

	public void setFiveHundredRupeeNote(int fiveHundredRupeeNote) {
		this.fiveHundredRupeeNote = fiveHundredRupeeNote;
	}

}
