package exception_handling;

import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter A");
		int A = scan.nextInt();
		System.out.println("enter B");
		int B = scan.nextInt();
		int c = A/B;
		System.out.println("the result is "+c);
		}catch(Exception e) {
			System.out.println(" ");
		}
		System.out.println("program executed");
		System.out.println("successfully");

	}

}
