package intermediateJavaPrograms;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int t=0;
		while(n2>0)
	   	{
	   	     t=n2;
	   	     n2=n1% n2; 
	   	     n1=t;
	   	}
		System.out.println("HCF= "+n1);
	}

}
