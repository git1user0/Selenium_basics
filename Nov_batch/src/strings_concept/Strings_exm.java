package strings_concept;

public class Strings_exm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "==" to compare address
		
		String str1 ="Aarvi";
		String str2 ="Aarvi";
		String str3 ="aarvi";
		
		if(str1==str2) {
			System.out.println("address is same");
		}else {
			System.out.println("address is different");
		}
		if(str1==str3) {
			System.out.println("address is same");
		}else {
			System.out.println("address is different");
		}
		System.out.println(System.identityHashCode(str1));

	}

}
