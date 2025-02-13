package abstraction_concept;

public abstract class Shape {
	float area;
	abstract void CollectInput();
	abstract void CalculateArea();
	
	void display() {
		System.out.println("the Area of  "+ area);
	}
}
