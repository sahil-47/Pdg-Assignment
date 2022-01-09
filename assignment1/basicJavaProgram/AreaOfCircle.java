package basicJavaProgram;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextFloat();
        double area=Math.pow((Math.PI*radius),2);
        System.out.println("Area = "+area);
	}

}
