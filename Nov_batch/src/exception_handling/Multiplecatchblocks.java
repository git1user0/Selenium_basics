package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplecatchblocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter a num for A");
		int A = scan.nextInt();
		System.out.println("enter a num for B");
		int B = scan.nextInt();
		int c = A/B;
		System.out.println("the result is "+c);
		System.out.println("enter the array index");
		int index = scan.nextInt();
		arr[index]=5;
		} catch(InputMismatchException e){
			System.out.println("input mismatch");
		}catch(ArithmeticException e){
			System.out.println("arithmetic exception");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array error");
		}catch(Exception e) {
			System.out.println("executed successfully");
		}
		System.out.println("execution"); // rest of the block is executed
		

	}

}
