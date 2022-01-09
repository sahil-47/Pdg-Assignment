package intermediateJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int t=n;
		int s=0;
		while(n>0) {
			int d=n%10;
			s=s*10+d;
			n=n/10;
		}
		
		
		if(s==t) {
			System.out.println(t + " is a palindrome");
		}
		else
			System.out.println("Not a paindrome");

	}

}
