package arrays_concept;

import java.util.Scanner;

public class Two_dimensional_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* whenever the data is complex we use 
		 * two dimensional arrays
		 * SYNTAX :
		 * DATA_TYPE ARR[] []  = NEW DATA_TYPE [NO OF SIZE] [NO OF SIZE]*/
		// for handling rows
		int arr[][]=new int[2][2];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			// for handling columns
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the value");
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			// for handling columns
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
/* in two dimensional arrays, if we say arr.length,it would return total number of rows
 * in two dimensional arrays, if we say arr[i].length,it would return total number of columns in each row */
