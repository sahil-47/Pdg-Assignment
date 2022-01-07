package basicJavaProgram;

import java.util.Scanner;

public class PerimeterOfSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int perimeter=4*side;
        System.out.println("Perimeter = "+perimeter);

	}
}
