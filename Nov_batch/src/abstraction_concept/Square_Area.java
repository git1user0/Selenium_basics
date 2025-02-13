package abstraction_concept;

import java.util.Scanner;

public class Square_Area extends Shape {
	
	float length;
	@Override
	void CollectInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Square");
		length = scan.nextFloat();
		
	}

	@Override
	void CalculateArea() {
		// TODO Auto-generated method stub
		area = length*length;
	}


	

}
