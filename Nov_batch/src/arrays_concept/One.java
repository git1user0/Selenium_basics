package arrays_concept;

import java.util.Scanner;

public class One {
	public static void main(String[] args){
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in); //used to collect inputs from the system
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("ENTER THE NUMBER");
			arr[i] = scan.nextInt();   // collects value of i and stores in array
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
}

/* is is always better to calculate length of array automatically , than hard coding the values
so instead of hard coding the length , we can use length property of array , this gives use exact size of array

for each loop; whenever our intention is to just read the array and display the 
the contents , we can use for each loop
*/

/* syntax for each loop 
for(data type variable_name: arr_name){
// statements to be  printed
}
*/

}