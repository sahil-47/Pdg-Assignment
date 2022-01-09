package basicJavaProgram;

import java.util.Scanner;

public class PerimeterOfCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter = "+perimeter);
	}

}
