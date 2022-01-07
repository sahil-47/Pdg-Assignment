package intermediateJavaPrograms;

import java.util.Scanner;

public class CommissionPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		System.out.println("Enter the commission percent");
		int percent=sc.nextInt();
		float commission=(amount*percent)/100;
		System.out.println("Commission = "+commission);


	}

}
