package staticx;

public class Static_keyword {
	
	static int a = 10;
	int b = 20;
	
	static void m1() {
		System.out.println("this method is m1");
	}
	void m2() {
		System.out.println("this method is m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_keyword sc = new Static_keyword() ;
		sc.m2();
		System.out.println(sc.b);
		
		int b = 40;
		System.out.println(b);
		
		m1();
		System.out.println(a);
		
	}

}
