
public class GCD {
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
