package strings_concept;

public class String_exm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="Aarvi";
		String str2 =new String("Aarvi");
		
		if(str1==str2) {
			System.out.println("address is same");
		}else {
			System.out.println("address is different");
		}
		if(str1.equals(str2)) {
			System.out.println("data is same");
		}else {
			System.out.println("data is different");
		}

	}

}
