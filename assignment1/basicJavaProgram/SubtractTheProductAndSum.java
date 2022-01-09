package basicJavaProgram;

import java.util.Scanner;

public class SubtractTheProductAndSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0,product=1;
        while(number>0) {
        	int d=number%10;
        	sum+=d;
        	product=product*d;
        	number=number/10;
        }
        
        
        System.out.println("Difference between product and sum = "+ (product-sum));
	
	}


}
