package com.service;

import com.model.Coin;
import com.model.Note;
import com.model.Wallet;

public class TotalMoneyInWalletService implements TotalMoneyService {

	@Override
	public int sumOfMoney(Wallet wallet) {

		int sum = 0;

		for (Coin coin : wallet.getCoins()) {
			sum += coin.getOneRupeeCoin();
			sum += coin.getTwoRupeeCoin() * 2;
			sum += coin.getFiveRupeeCoin() * 5;
			sum += coin.getTenRupeeCoin() * 10;
		}

		for (Note note : wallet.getNotes()) {
			sum += note.getTenRupeeNote() * 10;
			sum += note.getTwentyRupeeNote() * 20;
			sum += note.getFiftyRupeeNote() * 50;
			sum += note.getHundredRupeeNote() * 100;
			sum += note.getFiveHundredRupeeNote() * 500;
		}

		return sum;

	}

	@Override
	public int totalNoCoins(Wallet wallet) {
		int totalCoins = 0;

		for (Coin coin : wallet.getCoins()) {
			totalCoins += coin.getOneRupeeCoin();
			totalCoins += coin.getTwoRupeeCoin();
			totalCoins += coin.getFiveRupeeCoin();
			totalCoins += coin.getTenRupeeCoin();
		}
		return totalCoins;
	}

	@Override
	public int totalNoNotes(Wallet wallet) {
		
		int totalNotes= 0;
		
		for (Note note : wallet.getNotes()) {
			totalNotes += note.getTenRupeeNote();
			totalNotes += note.getTwentyRupeeNote();
			totalNotes += note.getFiftyRupeeNote();
			totalNotes += note.getHundredRupeeNote();
			totalNotes += note.getFiveHundredRupeeNote();
		}
		return totalNotes;
	}

	@Override
	public int totalSumOfCoins(Wallet wallet) {
		int sumOfCoins = 0;

		for (Coin coin : wallet.getCoins()) {
			sumOfCoins += coin.getOneRupeeCoin();
			sumOfCoins += coin.getTwoRupeeCoin() * 2;
			sumOfCoins += coin.getFiveRupeeCoin() * 5;
			sumOfCoins += coin.getTenRupeeCoin() * 10;
		}
		return sumOfCoins;
	}

	@Override
	public int totalSumOfNotes(Wallet wallet) {
		
		int sumOfNotes= 0;
		
		for (Note note : wallet.getNotes()) {
			sumOfNotes += note.getTenRupeeNote() * 10;
			sumOfNotes += note.getTwentyRupeeNote() * 20;
			sumOfNotes += note.getFiftyRupeeNote() * 50;
			sumOfNotes += note.getHundredRupeeNote() * 100;
			sumOfNotes += note.getFiveHundredRupeeNote() * 500;
		}
		return sumOfNotes;
	}
}
