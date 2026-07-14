package pack1;

public class multilevelStudent extends multilevelDept {

	String student_name ="akhila";
	public void display1() {
		System.out.println("student_name :"+student_name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multilevelStudent obj = new multilevelStudent();
		obj.show();
		obj.display();
		obj.display1();

	}

}
