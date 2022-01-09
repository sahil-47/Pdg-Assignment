package basicJavaProgram;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float height=sc.nextFloat();
        
        double surfaceArea=2*Math.PI*radius*height;
        System.out.println("Curved Surface Area = "+ surfaceArea);
	}

}
