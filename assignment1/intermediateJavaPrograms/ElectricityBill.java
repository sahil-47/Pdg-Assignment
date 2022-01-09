package intermediateJavaPrograms;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int unit=sc.nextInt();
		int bill=0;
		if(unit<=100) {
			bill=unit*10;
		}
		else if(unit<=200) {
			bill=100*10+(unit-100)*15;
			
		}
		else if(unit<=300) {
			bill=100*10+100*15+(unit-200)*20;
		}
		else {
			bill=100*10+100*15+100*20+(unit-300)*25;
		}
		System.out.println("Electrcity Bill ="+bill);
        
	}

}
