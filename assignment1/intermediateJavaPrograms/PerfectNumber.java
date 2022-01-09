package intermediateJavaPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				s+=i;
		}
		if(s==n) {
			System.out.println("Perfect number");
			
		}
		else {
			System.out.println("Not a perfect number");
		}

	}

}
