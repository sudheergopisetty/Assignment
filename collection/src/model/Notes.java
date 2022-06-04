package model;

public class Notes {
	private int tenRupeeNote;
	private int twentyRupeeNote;
	private int fiftyRupeeNote;
	private int oneHundredNote;
	private int twoHundredNote;
	private int fiveHundredNote;
	private int twoThousandNote;
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
	public int getOneHundredNote() {
		return oneHundredNote;
	}
	public void setOneHundredNote(int oneHundredNote) {
		this.oneHundredNote = oneHundredNote;
	}
	public int getTwoHundredNote() {
		return twoHundredNote;
	}
	public void setTwoHundredNote(int twoHundredNote) {
		this.twoHundredNote = twoHundredNote;
	}
	public int getFiveHundredNote() {
		return fiveHundredNote;
	}
	public void setFiveHundredNote(int fiveHundredNote) {
		this.fiveHundredNote = fiveHundredNote;
	}
	public int getTwoThousandNote() {
		return twoThousandNote;
	}
	public void setTwoThousandNote(int twoThousandNote) {
		this.twoThousandNote = twoThousandNote;
	}
	public Notes(int tenRupeeNote, int twentyRupeeNote, int fiftyRupeeNote, int oneHundredNote, int twoHundredNote,
			int fiveHundredNote, int twoThousandNote) {
		super();
		this.tenRupeeNote = tenRupeeNote;
		this.twentyRupeeNote = twentyRupeeNote;
		this.fiftyRupeeNote = fiftyRupeeNote;
		this.oneHundredNote = oneHundredNote;
		this.twoHundredNote = twoHundredNote;
		this.fiveHundredNote = fiveHundredNote;
		this.twoThousandNote = twoThousandNote;
	}
	
	

}
