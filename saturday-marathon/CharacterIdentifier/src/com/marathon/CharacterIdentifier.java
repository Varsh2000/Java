package com.marathon;

import java.util.Scanner;

public class CharacterIdentifier {
		public static void identifyCharacter(char ch) 
	{
	 if(ch>='a' && ch<='z') {
		 System.out.println(ch+ " is a lower case character");
		 if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u') {
			 System.out.println(ch+ " is a consonant");
		 }
	 }
	 else if(ch>='A' && ch<='Z') {
		 System.out.println(ch+ " is a upper case character");
	 		 if(ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U') {
			 System.out.println(ch+ " is a consonant");
		 }}
	 else if(ch>=0 && ch<=9) {
		 System.out.println(ch+ " is a digit");
	 }
	
	 else {
		 System.out.println(ch+ " is a special character");
	 }

	} 
	public static void main(String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a character: ");
	 char ch=s.next().charAt(0);
	 identifyCharacter(ch);
	 }
}
