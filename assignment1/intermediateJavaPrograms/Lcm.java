package intermediateJavaPrograms;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int t1=n1;
		int t2=n2;
		int t=0;
		while(n2>0)
	   	{
	   	     t=n2;
	   	     n2=n1% n2; 
	   	     n1=t;
	   	}
		 int lcm=(t1*t2)/n1;
		 System.out.println("LCM = "+lcm);
	}

}
