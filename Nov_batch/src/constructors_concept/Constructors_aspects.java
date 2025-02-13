package constructors_concept;

class student {
	String name,qualification;
	int age;
	
	student (){
		System.out.println("student constructor is called");
	}
	void run() {
		System.out.println("student is running");
	}
	void sleep() {
		System.out.println("student is sleeping");
	}
	void study() {
		System.out.println("student is studying");
	}
}

public class Constructors_aspects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st = new student();
		st.run();
		st.sleep();
		st.sleep();

	}

}
