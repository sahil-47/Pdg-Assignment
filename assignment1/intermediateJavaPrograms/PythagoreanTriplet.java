package intermediateJavaPrograms;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        PythagoreanTriplet ob=new PythagoreanTriplet();
        boolean f= ob.triplet(n1, n2, n3);
        if(f==true) {
        	System.out.println(n1+" "+n2 +" "+n3 +" is a pythagorean triplet");
        }
        else {
        	System.out.println("Not a triplet");
        }
        
	}
	public boolean triplet(int a,int b,int c) {
		if(a*a+b*b==c*c) {
			return true;
		}
		return false;
	}

}
