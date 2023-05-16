import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChallangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		BigInteger num=BigInteger.valueOf(-1);
		
		 try {
			  System.out.println("Enter a number to check if it's an Armstrong number or not (0 to stop):");
		      num=input.nextBigInteger();
		    } catch (InputMismatchException e) {
		      System.out.print("This input is not valid! ");
		      input.nextLine(); 
		    }
		 
		while(num.compareTo(BigInteger.ZERO)!=0) {
			if(num.compareTo(BigInteger.ZERO)==-1)
				System.out.print("Enter a positive integer!\n");
			else {
				if(ChallangeSys.isArmstrong(num)) 
					System.out.print ("\n" + num + " is an Armstrong number!");
				else
					System.out.print ("\n" + num + " is not an Armstrong number!");
			}	
			
			try {
				  System.out.println("\nEnter a number to check if it's an Armstrong number or not (0 to stop):");
			      num=input.nextBigInteger();
			    } catch (InputMismatchException e) {
			      System.out.print("This input is not valid! ");
			      input.nextLine(); 
			    }
		}
		
		System.out.println("\nProgram Stopped");
	}

}
