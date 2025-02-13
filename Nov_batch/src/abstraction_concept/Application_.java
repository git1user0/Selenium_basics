package abstraction_concept;

public class Application_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle_Area n1= new Rectangle_Area();
		
		n1.CollectInput();
		n1.CalculateArea();
		n1.display();
		
		Square_Area n2= new Square_Area();
		
		n2.CollectInput();
		n2.CalculateArea();
		n2.display();
		
		Circle n3 = new Circle();
		n3.CollectInput();
		n3.CalculateArea();
		n3.display();

	}

}
