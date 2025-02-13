package inheritence;

class A{
	static int a =40;
	
	void display() {
		System.out.println("this is class A");
	}
}

class B extends A {
	static int b =20;
	
	void print() {
		System.out.println("this is class b");
	}
}

public class Inheritance_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B();
		obj.display();
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}

}
