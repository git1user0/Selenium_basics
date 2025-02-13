package inheritence;

class bank {
	int getRateOfInterest() // -> is the definition/signatureS of class
	{
		return 0;          // -> is the IMPLEMENATION part of class
	}
}
class SBI extends bank{
	int getRateOfInterest() {
		return 10;
	}
}
class HDFC extends bank{
	int getRateOfInterest() {
		return 20;
	}
}

public class Overriding_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sb = new SBI();
		System.out.println(sb.getRateOfInterest());
		HDFC hd = new HDFC();
		System.out.println(hd.getRateOfInterest());
		

	}

}
