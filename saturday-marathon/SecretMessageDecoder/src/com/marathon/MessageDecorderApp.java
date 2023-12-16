package com.marathon;

public class MessageDecorderApp {

	public static void main(String[] args) {
		MessageDecoder decoder = new MessageDecoder(); 

		System.out.println(decoder.decodeCharacter('A')); 

	}

}
