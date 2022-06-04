package model;

public class Wallets {
	private int walletId;
	private String walletOwnerName;
	
	private Coins allCoins;
	private Notes allNotes;
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public String getWalletOwnerName() {
		return walletOwnerName;
	}
	public Wallets(int walletId, String walletOwnerName, Coins allCoins, Notes allNotes) {
		super();
		this.walletId = walletId;
		this.walletOwnerName = walletOwnerName;
		this.allCoins = allCoins;
		this.allNotes = allNotes;
	}
	public void setWalletOwnerName(String walletOwnerName) {
		this.walletOwnerName = walletOwnerName;
	}
	public Coins getAllCoins() {
		return allCoins;
	}
	public void setAllCoins(Coins allCoins) {
		this.allCoins = allCoins;
	}
	public Notes getAllNotes() {
		return allNotes;
	}
	public void setAllNotes(Notes allNotes) {
		this.allNotes = allNotes;
	}

}
