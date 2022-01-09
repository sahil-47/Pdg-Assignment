package basicJavaProgram;

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float height=sc.nextFloat();
        double volume=Math.PI*radius*radius*height;
        System.out.println("Volume = "+volume);

	}

}
