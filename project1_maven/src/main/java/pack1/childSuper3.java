//calling parent class constructor from child class using 

package pack1;

public class childSuper3 extends parentSuper3 {

	childSuper3(){
		super();
		System.out.println("child class constructor");
		
	}
	
	public static void main(String[]args) {
		childSuper3 obj1 = new childSuper3();
	}
	
	
}
