package functions_java;

class Stranger{
	int add(int a,int b) {
		int sum;
		sum = a+b;
		return sum;
	}
}

public class Accept_inputs_returns_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stranger S = new Stranger();
		
		System.out.println(S.add(1, 2));

	}

}
