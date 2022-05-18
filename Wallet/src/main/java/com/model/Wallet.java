package com.model;

import java.util.List;

public class Wallet {

	private String walletName;
	private int walletId;
	private List<Coin> coins;
	private List<Note> notes;

	public Wallet(String walletName, int walletId, List<Coin> coins, List<Note> notes) {
		super();
		this.walletName = walletName;
		this.walletId = walletId;
		this.coins = coins;
		this.notes = notes;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
