import java.util.Scanner;

public class DigitSumApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=scan.nextInt();
		DigitSum digitSum=new DigitSum();
		int sum=digitSum.findDigitSum(n);
		System.out.println("SUM OF DIGITS OF THE NUMBER "+n+"IS "+sum);
	}
}
