package com.strings.level3;

public class Reverse {
	String stringReverse(String str)
	{
	char arr[]=str.toCharArray();
	char revarr[]=new char[arr.length];
	//Copy Spaces 1st
	for(int i=0;i<=arr.length-1;i++)
	{
	if(arr[i]==' ')
	{
	revarr[i]=arr[i];
	}
	}

	//rev the char array
	int j=revarr.length-1;
	for(int i=0;i<=arr.length-1;i++)
	{
	if(arr[i]!=' ')
	{
	if(revarr[j]==' ')
	{
	j--;
	}
	revarr[j]=arr[i];
	j--;
	}
	}
	str=new String(revarr);
	return str;
	}

}
