package method_overloading;

class adding {
	
	void add() {
		int num1=10,num2=20,sum;
		sum = num1+num2;
		System.out.println(sum);
		
	}
	void add(int x,int y) {
		int sum = x+y;
		System.out.println(sum);
	}
	void add(float m,float n) {
		float sum = m+n;
		System.out.println(sum);
	}
	void add(float w,int e) {
		float sum = w + e;
		System.out.println(sum);
	}
}

public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		adding ne = new adding();
		ne.add();
		ne.add(10.3538723f, 0.16345678232f);
		ne.add(12,12);
		ne.add(13.2421f,53);
		


	}

}
