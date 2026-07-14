
// super to call parent method when the method has same name in child and parent class
package pack1;

public class childSuper2 extends parentSuper2{

	int num = 700;
	void show() {
		System.out.println(num);
		System.out.println(super.num);
		display();
		super.display();
		
	}
	
	public void display() {
		System.out.println("hellooo");
	}
	

	public static void main(String[] args) {
		childSuper2 obj=new childSuper2();
		obj.show();
}

}
	
	
