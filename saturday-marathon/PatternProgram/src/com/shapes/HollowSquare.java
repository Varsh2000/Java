package com.shapes;

public class HollowSquare {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++ )
	    {
	      for (int j = 1 ; j <= 5; j++ )
	      {
	        if (i == 1 || i == 5 || j == 1|| j == 5)
	        {
	          System.out.print("*"+" ");
	        }
	        else {
	          // Double spaces are to accommodate space between the stars
	          // For example, when square side size is 5, the total spaces
	          // in 2nd row, between  first and last star are:
	          // 7 (3 for stars + 4 for spaces between stars)
	          System.out.print(" "+ " ");
	        }
	      }
	      System.out.println();
	    }
	}
}


