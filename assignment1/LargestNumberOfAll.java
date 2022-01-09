package assignment1;

import java.util.Scanner;

public class LargestNumberOfAll {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int largest=0;
		int n;
		do {
		    n=sc.nextInt();
			if(n>largest)
				largest=n;
		}while(n!=0);
		System.out.println("largest = "+largest);
	}
		
   
}
