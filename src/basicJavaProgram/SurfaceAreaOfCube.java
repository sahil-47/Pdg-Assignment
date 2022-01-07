package basicJavaProgram;

import java.util.Scanner;

public class SurfaceAreaOfCube {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double surfaceArea=6*Math.pow(a, 2);
        System.out.println("Surface Area = "+ surfaceArea);
	}

}
