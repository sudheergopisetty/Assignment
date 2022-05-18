package com.model;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

	private int walletId;
	private String ownerName;
	private List<Coin> coins = new ArrayList<Coin>();
	private List<Note> notes= new ArrayList<Note>();
	public Wallet() {
		super();
	}

	public Wallet(int walletId, String ownerName) {
		this.walletId = walletId;
		this.ownerName = ownerName;
	}

	public Wallet(int walletId, String ownerName, List<Coin> coins, List<Note> notes) {
		this.walletId = walletId;
		this.ownerName = ownerName;
		this.coins = coins;
		this.notes = notes;
	}

	

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}
	
	public void addCoins(Coin coins) {
		this.coins.add(coins);
	}
	
	public void addNotes(Note coins) {
		this.notes.add(coins);
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
}
