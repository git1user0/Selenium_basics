package arrays_concept;

import java.util.Scanner;

public class One_dimensionals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in); //used to collect inputs from the system
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("ENTER THE NUMBER");
			arr[i] = scan.nextInt();   // collects value of i and stores in array
		}
		
		for(int num: arr) {
			System.out.println(num);// arr = array name // num = variable name for integer data type
		}
			
	}
}
