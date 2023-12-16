package com.strings.level4;

public class ReverseApp {
	String wordReverse(String str)
	{
		String words[]=str.split(" ");
		String revword=null;
		String revString="";
		for(int i=0;i<=words.length-1;i++)
		{
			String word=words[i];
			char ch[]=word.toCharArray();
			char rch[]=new char[ch.length];
			int j=rch.length-1;
			for(int k=0;k<=ch.length-1;k++)
			{
				rch[j]=ch[k];
				j--;
			}
			revword=new String(rch);
			revString =revString+revword+" ";
		}
		return revString;
	}	
}
