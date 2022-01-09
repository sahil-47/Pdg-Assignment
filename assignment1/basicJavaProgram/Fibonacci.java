package basicJavaProgram;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,s=1;
        System.out.println(f+"\n"+s);
        for(int i=3;i<=n;i++) {
        	int t=f+s;
        	System.out.println(t);
        	f=s;
        	s=t;
        	
        }
     
	}

}
