package interfaces_concept;

import java.util.Scanner;

public class Demo2 implements Compute{
	int A,B;
	void getInputs(){
		System.out.println("enter the values for A & B");
		Scanner sc = new  Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
	}
	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int sum = A + B;
		System.out.println(sum);
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		int sub = A - B;
		System.out.println(sub);
		
	}

}
