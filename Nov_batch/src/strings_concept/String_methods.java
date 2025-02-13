package strings_concept;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello all, welcome to The class";
		String s1 = "hello all, welcome to The class";
		//String S = "selenium";
		/*System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s+" "+S);
		System.out.println(s.concat(" ").concat(S));*/
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("data is same");
		}else {
			System.out.println("data is different");
		}
		
	}

}
