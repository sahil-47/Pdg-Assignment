package intermediateJavaPrograms;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the exponent");
		int exponent=sc.nextInt();
        int power=1;
        for(int i=1;i<=exponent;i++) {
        	power=power*base;
        }
        System.out.println("Power = "+power);
	}

}
