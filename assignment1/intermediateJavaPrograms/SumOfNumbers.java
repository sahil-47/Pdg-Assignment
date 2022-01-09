package intermediateJavaPrograms;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int number=sc.nextInt();
			sum+=number;
		}
		System.out.println("Sum = "+sum);

	}

}
