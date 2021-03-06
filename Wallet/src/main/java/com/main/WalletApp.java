package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Coin;
import com.model.Note;
import com.model.Wallet;
import com.service.TotalMoneyInWalletService;

public class WalletApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name of the Wallet Owner");

		String walletName = sc.next();

		System.out.println("Enter Id of the Wallet");
		int id= sc.nextInt();
		
		System.out.println("Enter No. of coins you have: ");
		
		System.out.println("Enter One Rupee coins :");
		int oneRupeeCoin= sc.nextInt();
		
		System.out.println("Enter Two Rupee coins :");
		int twoRupeeCoin= sc.nextInt();
		
		System.out.println("Enter Five Rupee coins :");
		int fiveRupeeCoin= sc.nextInt();
		
		System.out.println("Enter Ten Rupee coins :");
		int tenRupeeCoin= sc.nextInt();

		Coin coin1 = new Coin(oneRupeeCoin, twoRupeeCoin, fiveRupeeCoin, tenRupeeCoin);
//		Coin coin2= new Coin(5, 12, 6, 7);

		List<Coin> coins = new ArrayList<Coin>();

		coins.add(coin1);
		//coins.add(coin2);

		System.out.println("Enter Ten Rupee Notes :");
		int tenRupeeNote= sc.nextInt();
		
		System.out.println("Enter Twenty Rupee Notes :");
		int twentyRupeeNote= sc.nextInt();
		
		System.out.println("Enter Fifty Rupee Notes :");
		int fiftyRupeeNote= sc.nextInt();
		
		System.out.println("Enter Hundred Rupee Notes :");
		int hundredRupeeNote= sc.nextInt();
		
		System.out.println("Enter Five Hundred Rupee Notes :");
		int fiveHundredRupeeNote= sc.nextInt();
		
		Note note1 = new Note(tenRupeeNote, twentyRupeeNote, fiftyRupeeNote, hundredRupeeNote, fiveHundredRupeeNote);
		//Note note2 = new Note(5, 4, 7, 2, 9);

		List<Note> notes = new ArrayList<Note>();

		notes.add(note1);
		//notes.add(note2);

		Wallet wallet1 = new Wallet(walletName, id , coins, notes);

		List<Wallet> wallets = new ArrayList<Wallet>();

		wallets.add(wallet1);

		// System.out.println(wallet1.getNotes().size());

		TotalMoneyInWalletService moneyInWalletService = new TotalMoneyInWalletService();

		int sumOfWallet = moneyInWalletService.sumOfMoney(wallet1);
		int totalNoCoins= moneyInWalletService.totalNoCoins(wallet1);
		int totalNoNotes= moneyInWalletService.totalNoNotes(wallet1);
		int totalSumOfCoins = moneyInWalletService.totalSumOfCoins(wallet1);
		int totalSumOfNotes = moneyInWalletService.totalSumOfNotes(wallet1);
		
		System.out.println(walletName+"'s wallet has total"+ totalNoCoins +" Coins!");
		System.out.println(walletName+"'s wallet has total"+ totalNoNotes +" Notes!");
		System.out.println(walletName+"'s wallet has total"+ totalSumOfCoins +" Change/coin worth");
		System.out.println(walletName+"'s wallet has total "+ totalSumOfNotes +" Note worth");

		System.out.println(walletName+ "'s has a total money of "+ sumOfWallet+ " Rupees");
		
		sc.close();
	}

}
