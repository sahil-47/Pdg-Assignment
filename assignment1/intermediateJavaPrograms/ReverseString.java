package intermediateJavaPrograms;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		System.out.println("Reverse of "+s+" is "+sb.reverse());

	}

}
