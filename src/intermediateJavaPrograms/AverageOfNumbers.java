package intermediateJavaPrograms;
import java.util.*;
public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int number=sc.nextInt();
			sum+=number;
		}
		System.out.println("Average = "+(sum/n));

	}

}
