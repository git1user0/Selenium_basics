package abstraction_concept;

import java.util.Scanner;

public class Rectangle_Area extends Shape{
	float length,width;
	@Override
	void CollectInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length = scan.nextFloat();
		System.out.println("Enter the width of rectangle");
		width = scan.nextFloat();
	}

	@Override
	void CalculateArea() {
		// TODO Auto-generated method stub
		area = length*width;
	}
}