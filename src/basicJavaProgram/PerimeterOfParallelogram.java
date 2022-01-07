package basicJavaProgram;

import java.util.Scanner;

public class PerimeterOfParallelogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int perimeter=2*(side1+side2);
	    System.out.println("Perimeter= "+perimeter);
	}


}
