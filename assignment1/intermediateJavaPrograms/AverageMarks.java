package intermediateJavaPrograms;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int n=sc.nextInt();
		System.out.println("Enter marks ");
		double sum=0;
		for(int i=0;i<n;i++) {
			int marks=sc.nextInt();
			sum+=marks;
		}
		double average=sum/n;
		System.out.println("average="+average);

	}

}
