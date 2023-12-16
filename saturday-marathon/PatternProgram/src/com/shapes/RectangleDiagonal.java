package com.shapes;

public class RectangleDiagonal {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++ )
	    {
	      for (int j = 1 ; j <= 6; j++ )
	      {
	        if (i == 1 || i == 5 || j == 1|| j == 6||i==j)
	        {
	          System.out.print("*");
	        }
	        else {
	            System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
}
}
