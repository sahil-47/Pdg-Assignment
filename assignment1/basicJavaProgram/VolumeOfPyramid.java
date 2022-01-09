package basicJavaProgram;

import java.util.Scanner;

public class VolumeOfPyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        float width=sc.nextFloat();
        float height=sc.nextFloat();
        
        float volume=(length*width*height)/3;
        System.out.println("Volume = "+volume);

	}


}
