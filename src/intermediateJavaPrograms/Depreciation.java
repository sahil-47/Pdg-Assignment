package intermediateJavaPrograms;

import java.util.Scanner;

public class Depreciation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		System.out.println("Enter depreciation percentage");
		int percent=sc.nextInt();
		System.out.println("enter years");
		int year=sc.nextInt();
		int t=amount;
		for(int i=0;i<year;i++) {
		t=((100-percent)*t)/100;
		}
		System.out.println("Depreciation = "+t);
	}

}
