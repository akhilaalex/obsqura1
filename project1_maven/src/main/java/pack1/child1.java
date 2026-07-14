package pack1;

public class child1 extends parent1 {
	int num = 700;
	void show() {
		System.out.println(num);
		System.out.println(super.num);
		
	}
	

	public static void main(String[] args) {
		child1 obj=new child1();
		obj.show();
}

}