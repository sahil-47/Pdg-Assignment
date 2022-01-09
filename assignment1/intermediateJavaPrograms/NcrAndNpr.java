package intermediateJavaPrograms;

import java.util.Scanner;

public class NcrAndNpr {
	public static void main(String arg[]) {	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n");
    int n=sc.nextInt();
	System.out.println("Enter value of r");
    int r=sc.nextInt();
    NcrAndNpr ob=new NcrAndNpr();	
	if(n>=r) {
		double combination=ob.factorial(n)/(ob.factorial(n-r)*ob.factorial(r));
		double permutation=ob.factorial(n)/ob.factorial(n-r);	
		System.out.println("Permutation = "+permutation);	
		System.out.println("Combination = "+combination);
	}
	else {
		System.out.println("Value of n is smaller than r");	
		
	}
				
	}
	public double factorial(double n) {
		double f=1;
	    for(int i=1;i<=n;i++) {
	    	 f=f*i;
	    }
	    return f;	 
	    
	   	  
 	    
  	      
	}
}