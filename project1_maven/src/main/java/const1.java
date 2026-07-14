
public class const1 {
	String name,course;
	
	const1(String name1,String course1){
		name=name1;
		course= course1;
	}
	
	public void display() {
		System.out.println("Name="+name);
		System.out.println("Course="+course);
	}

	public static void main(String[] args) {
		const1 obj = new const1("Akhila","Java");
		obj.display();
		// TODO Auto-generated method stub

	}

}
