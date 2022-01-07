package assignment1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 float principle=sc.nextInt();
		 float rate=sc.nextFloat();
		 float time=sc.nextFloat();
		 float simpleInterest=(principle*rate*time)/100;
		 System.out.println("Simple Interest = "+simpleInterest);
		 
	}
 
}
