package constructors_concept;

class Box1{
	double length,width,height;
	
	Box1(){
		width = 0;
		height = 0;
		length = 0;
	}
	Box1(double w,double h,double l){
		width = w;
		height = h;
		length = l;
	}
	Box1(double len){
		len =length*width*height;
	}
	double volume() {
		return(length*width*height);
	}
}

public class Box { //constructor overloading

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 bw= new Box1();
		Box1 b= new Box1(10.2,12.33,13.44);
		Box1 b12= new Box1(10.26753457);
		System.out.println(bw.volume());
		System.out.println(b.volume());
		System.out.println(b12.volume());
		bw.volume();
		
		/*constructors is used for assigning data into variables and no operations are
		 * performed in constructor*/

	}

}
