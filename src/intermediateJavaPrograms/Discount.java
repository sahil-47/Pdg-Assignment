package intermediateJavaPrograms;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		System.out.println("Enter the discount percent");
		int discount=sc.nextInt();
		float discountPrice=(amount*discount)/100;
		System.out.println("Discount offered = "+discountPrice);
		

	}

}
