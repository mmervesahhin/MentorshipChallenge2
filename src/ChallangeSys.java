import java.math.BigInteger;

public class ChallangeSys {

	public static int numOfDigits(BigInteger num) {
		int n=1;
		
		while(num.mod(BigInteger.TEN).compareTo(num)!=0) {
			num=num.divide(BigInteger.TEN);
			n++;
		}
		
		return n;
	}
	
	public static boolean isArmstrong(BigInteger num) {
		BigInteger sum=BigInteger.ZERO;
		BigInteger copy=num;
		int n=numOfDigits(num);
		
		while(copy.mod(BigInteger.TEN).compareTo(copy)!=0) {
			sum=sum.add(copy.mod(BigInteger.TEN).pow(n));
			copy=copy.divide(BigInteger.TEN);
		}
		sum=sum.add(copy.mod(BigInteger.TEN).pow(n));
		
		if(sum.compareTo(num)==0)
			return true;
		return false;
	}
}
