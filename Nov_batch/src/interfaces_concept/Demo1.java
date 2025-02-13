package interfaces_concept;

public class Demo1 implements Compute{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int num1=30,num2=10,sum;
		sum = num1 + num2 ;
		System.out.println("the sum is "+ sum);
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		int num1=30,num2=10,sub;
		sub = num1 - num2 ;
		System.out.println("the difference is "+ sub);
		
		
	}

}
