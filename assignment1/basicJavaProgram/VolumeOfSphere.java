package basicJavaProgram;

import java.util.Scanner;

public class VolumeOfSphere {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        
        double volume=(4*Math.PI*radius*radius*radius)/3;
        System.out.println("Volume = "+volume);

	}

}
