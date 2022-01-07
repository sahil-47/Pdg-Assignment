package basicJavaProgram;

import java.util.Scanner;

public class AreaOfRhombus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int diagonal1=sc.nextInt();
        int diagonal2=sc.nextInt();
        int area=(diagonal1*diagonal2)/2;
        System.out.println("Area = "+area);
	}

}
