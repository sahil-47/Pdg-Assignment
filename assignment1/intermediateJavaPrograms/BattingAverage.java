package intermediateJavaPrograms;

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter runs");
		int runs=sc.nextInt();
		System.out.println("Enter matches");
		int matches=sc.nextInt();
		System.out.println("Enter not out");
		int not_out=sc.nextInt();
		float average=(float)runs/(matches-not_out);
		System.out.println("Batting average="+average);
		
		
	}

}
