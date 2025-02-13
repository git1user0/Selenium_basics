package oops_concept;

public class oops_java {
	int e_ID,e_salary;
	String e_name,e_qualification;
	
	void bonus() {
		System.out.println(e_name);
		System.out.println(e_ID);
		System.out.println(e_qualification);
		System.out.println(e_salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oops_java e1 = new oops_java();
		e1.e_name="Ashwini";
		e1.e_ID=101;
		e1.e_qualification="trainer";
		e1.e_salary=10000;
		e1.bonus();
	}
}


/* 1.whenever we are defining how object should look like and what the object does, then we must
 * take the help of class
 * 2.in java whenever we are defining the HAS part/properties of objects, we should take help of variables
 * 2.in java whenever we are defining the DOES part/behavior of objects, we should take help of methods 
 * 
 * steps involved in creation of object 
 * 1.using "NEW" keyword we should be creating an object of class
 * 2.the"NEW" keyword will allocate memory in RAM with address
 * 3. whatever the class is specified with "new" keyword , the "new" keyword will go in search of that class
 * and allocate memory for all the variables and methods of that class
 * 4.once the memory is allocated,the address of object would be thrown back to us, we must collect
 * it using one variable of same data type as that of object  */