package com.solve;
public class Solution1 {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,8};
		int target=4;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==target)
					System.out.println(i+"-"+j);
			}
		}
		

	}

}
