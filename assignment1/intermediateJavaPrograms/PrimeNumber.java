package intermediateJavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
		int number1=sc.nextInt();
        System.out.println("Enter number 2");
        int number2=sc.nextInt();
        for(int i=number1;i<=number2;i++) {
        	int c=0;
        	for(int j=1;j<=i;j++) {
        		if(i%j==0) {
        			c++;
        		}
        	}
        	if(c==2) {
        		System.out.println(i);
        	}
        }
        

	}

}
