package intermediateJavaPrograms;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        while(number>0) {
        	int d=number%10;
        	sum+=d;
        	
        	number=number/10;
        }
        
        
        System.out.println(" sum = "+ sum);

	}

}
