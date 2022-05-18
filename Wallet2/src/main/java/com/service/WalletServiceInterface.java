package com.service;

import com.model.Wallet;

public interface WalletServiceInterface {

	public abstract int totalMoneyInWallet(Wallet wallet );
	public abstract int totalNoOfCoins(Wallet wallet);
	public abstract int totalNoOfNotes(Wallet wallet);
	public abstract int totalValueOfCoins(Wallet wallet);
	public abstract int totalValueOfNotes(Wallet wallet);
}
