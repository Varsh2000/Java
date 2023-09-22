import java.util.Scanner;

public class GCDApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers to find GCD");
	int m=scan.nextInt();
	int n=scan.nextInt();
	 
	int res=findGCD(m, n);
	System.out.println("GCD OF "+m+" AND "+n+" IS "+res);
	
}
static int findGCD(int m,int n)
{
	while(n!=0)
	{
		int rem=m%n;
		m=n;
		n=rem;
	}
	int gcd=m;
	return gcd;
}
}
