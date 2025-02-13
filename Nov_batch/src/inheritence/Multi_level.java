package inheritence;

class P{
	static int a =40;
	
	void display() {
		System.out.println("this is class P");
	}
}

class Q extends P {
	static int b =20;
	
	void print() {
		System.out.println("this is class Q");
	}
}

class R extends Q {
	static int c =20;
	
	void show() {
		System.out.println("this is class R");
	}
}

public class Multi_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		R rin = new R();
		System.out.println(rin.a);
		System.out.println(rin.b);
		System.out.println(rin.c);
		rin.print();
		rin.display();
		rin.show();
		

	}

}
