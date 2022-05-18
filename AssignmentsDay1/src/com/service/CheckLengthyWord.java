package com.service;

public class CheckLengthyWord {

	public void Check(String sentence) {
		String [] words = sentence.split(" ");
		
		String longest_word = "";
        int longest_word_len = 0;
        for(int i= 0; i < words.length;i++){
            String word = words[i];
            int len = word.length();
            if(len > longest_word_len ){
                longest_word = word;
                longest_word_len = len;
            }
        }
        System.out.println(longest_word);
	}
}
