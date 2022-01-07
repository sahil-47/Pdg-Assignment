package basicJavaProgram;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
	    int base=sc.nextInt();
	    int area=(base*height)/2;
	    System.out.println("area ="+area);
	}

}
