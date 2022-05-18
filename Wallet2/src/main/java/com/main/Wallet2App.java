package com.main;

import com.model.Coin;
import com.model.Note;
import com.model.Wallet;
import com.service.WalletServiceInterface;
import com.service.WalletServiceInterfaceImpl;

public class Wallet2App {

	public static void main(String[] args) {
		Coin coin1 = new Coin(1, 2005);
		Coin coin2 = new Coin(2, 2000);
		Coin coin5 = new Coin(5, 1999);
		Coin coin10 = new Coin(10, 2003);
		
		Note paperMoney10 = new Note(10, 2000);
		Note paperMoney20 = new Note(20, 2001);
		Note paperMoney50 = new Note(50, 2003);
		Note paperMoney100 = new Note(100, 1990);
		Note paperMoney200 = new Note(200, 1998);
		Note paperMoney500 = new Note(500, 2001);
		Note paperMoney2000 = new Note(2000, 2001);
		
		Wallet wallet = new Wallet(1, "asd");
		wallet.addCoins(coin1);
		wallet.addCoins(coin2);
		wallet.addCoins(coin5);
		wallet.addCoins(coin1);
		wallet.addCoins(coin10);
		wallet.addCoins(coin2);
		wallet.addCoins(coin1);
		wallet.addCoins(coin1);
		wallet.addCoins(coin1);
		wallet.addNotes(paperMoney10);
		wallet.addNotes(paperMoney2000);
		wallet.addNotes(paperMoney200);
		wallet.addNotes(paperMoney20);
		wallet.addNotes(paperMoney50);
		wallet.addNotes(paperMoney100);
		wallet.addNotes(paperMoney500);
		
		WalletServiceInterface worksInterface = new WalletServiceInterfaceImpl();
		
		System.out.println("Total money : "+worksInterface.totalMoneyInWallet(wallet));
		System.out.println("Total coins : "+worksInterface.totalNoOfCoins(wallet));
		System.out.println("Total notes : "+worksInterface.totalNoOfNotes(wallet));
		System.out.println("Total of coins : "+worksInterface.totalValueOfCoins(wallet));
		System.out.println("Total of notes : "+worksInterface.totalValueOfNotes(wallet));

	}

}
