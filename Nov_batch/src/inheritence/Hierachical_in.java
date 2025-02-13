package inheritence;

class parent {

	void display(int a) {
		System.out.println(a);
	}
}

// child 1 and child 2 are independent of each other

class child extends parent {

	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends parent {

	void print (int c) {
		System.out.println(c);
	}
}

public class Hierachical_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child n = new child();
		n.display(12);
		n.show(13);
		
		Child2 Ne = new Child2();
		Ne.display(112);
		Ne.print(113);

	}

}
