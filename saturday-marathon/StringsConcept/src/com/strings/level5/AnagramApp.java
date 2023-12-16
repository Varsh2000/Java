package com.strings.level5;

import java.util.Arrays;

public class AnagramApp {
	Boolean check(String s1,String s2) {
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<=arr1.length-1;i++)
		{
		if(arr1[i]!=arr2[i])
		{
		return false;
		}
		else
		{
		continue;
		}
		}
		return true;		

	}

}
