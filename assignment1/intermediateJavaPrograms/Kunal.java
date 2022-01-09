package intermediateJavaPrograms;

import java.util.Scanner;

public class Kunal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String month=sc.next();
        if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("March")||
        		month.equalsIgnoreCase("May")||month.equalsIgnoreCase("July")||
        		month.equalsIgnoreCase("October")||month.equalsIgnoreCase("August")||
        		month.equalsIgnoreCase("December")) {
        	System.out.println("Kunal can go out on ");
        	for(int i=1;i<=31;i++) {
        		
        		if(i%2==0) {
        			System.out.println(i+" "+month);
        		}
        	}
        	
        }
        else if(month.equalsIgnoreCase("Feburary")) {
        	System.out.println("Enter year");
        	int year=sc.nextInt();
        	System.out.println("Kunal can go out on ");
        	if((year%400==0)||((year%4==0)&&(year%100!=0))) {
        		
        		for(int i=1;i<=29;i++) {
            		
            		if(i%2==0) {
            			System.out.println(i+" "+month);
            		}
            	}
        	}
        	else {
        		for(int i=1;i<=28;i++) {
            		
            		if(i%2==0) {
            			System.out.println(i+" "+month);
            		}
            	}
        	}
        }
        else {
        	System.out.println("Kunal can go out on ");
        	for(int i=1;i<=30;i++) {
        		
        		if(i%2==0) {
        			System.out.println(i+" "+month);
        		}
        	}
        }
        
        

	}

}
