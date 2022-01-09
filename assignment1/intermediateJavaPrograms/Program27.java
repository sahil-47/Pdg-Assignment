package intermediateJavaPrograms;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number,soe=0,soo=0,son=0;;
		do{
			number=sc.nextInt();
			if(number<0) {
				son+=number;
			}
			else {
				if(number%2==0) {
					soe+=number;
				}
				else {
					soo+=number;
				}
			}
		}while(number!=0);
        System.out.println("Sum of odd positive number="+soo);
        System.out.println("Sum of even positive number="+soe);
        System.out.println("Sum of negative number="+son);
        

	}

}
