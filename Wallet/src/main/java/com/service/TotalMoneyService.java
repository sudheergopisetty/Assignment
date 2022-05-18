package com.service;

import com.model.Wallet;

public interface TotalMoneyService {

	public abstract int sumOfMoney(Wallet wallet);
	public abstract int totalNoCoins(Wallet wallet);
	public abstract int totalNoNotes(Wallet wallet);
	public abstract int totalSumOfCoins(Wallet wallet);
	public abstract int totalSumOfNotes(Wallet wallet);
}
