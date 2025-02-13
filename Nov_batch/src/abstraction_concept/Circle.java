package abstraction_concept;

import java.util.Scanner;

public class Circle extends Shape {
	
	float l,pi = 3.14f;
	
	@Override
	void CollectInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE:_");
		l = scan.nextFloat() ;
	}

	@Override
	void CalculateArea() {
		// TODO Auto-generated method stub
		area =  pi*(l * l);	
	}


}
