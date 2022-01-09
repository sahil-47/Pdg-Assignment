package intermediateJavaPrograms;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle");
		int principle=sc.nextInt();
		System.out.println("Enter rate");
	    double rate=sc.nextDouble();
		System.out.println("Enter time");
		double time=sc.nextDouble();
		double amount=principle*Math.pow((1+rate/100),time);
		double compoundInterest = amount-principle;
		System.out.println("Compound Interest= "+compoundInterest);
		

	}

}
