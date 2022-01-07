package basicJavaProgram;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int perimeter=2*(length+breadth);
	    System.out.println("Perimeter= "+perimeter);
	}

}
