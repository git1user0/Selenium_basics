package functions_java;

class calculator_ex{   // void = nothing
	void add(int num1,int num2) {
		int sum;
		sum=num1+num2;
		System.out.println(sum);
	}
}

public class Accepts_inputs_no_outputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator_ex ce = new calculator_ex();
		ce.add(1, 50);
		

	}

}
