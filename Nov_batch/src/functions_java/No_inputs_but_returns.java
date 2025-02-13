package functions_java;

class Calaci{
	int add() {
		int num1=1, num2=2, sum;
		sum=num1+num2;
		return sum;
	}
}

public class No_inputs_but_returns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calaci ci =new Calaci();
		System.out.println(ci.add());
		

	}

}
