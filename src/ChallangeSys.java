import java.math.BigInteger;

public class ChallangeSys {
	
	static BigInteger ten=BigInteger.TEN;
	static BigInteger zero=BigInteger.ZERO;
	static BigInteger one=BigInteger.ONE;

	public static int numOfDigits(BigInteger num) {
		int n=1;
		
		while(num.mod(ten).compareTo(num)!=0) {
			num=num.divide(ten);
			n++;
		}
		
		return n;
	}
	
	public static boolean isArmstrong(BigInteger num) {
		BigInteger sum=BigInteger.ZERO;
		BigInteger copy=num;
		int n=numOfDigits(num);
		
		while(copy.mod(ten).compareTo(copy)!=0) {
			sum=sum.add(copy.mod(ten).pow(n));
			copy=copy.divide(ten);
		}
		sum=sum.add(copy.mod(ten).pow(n));
		
		if(sum.compareTo(num)==0)
			return true;
		return false;
	}
}
