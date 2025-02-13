package arrays_concept;

import java.util.Scanner;

public class Jaggered_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int arr[][]=new int[3][];
		
		arr[0]= new int[3];
		arr[1]= new int[4];
		arr[2]= new int[5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the number for"+i+"th row"+j+"th column");
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
