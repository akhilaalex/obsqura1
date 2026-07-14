package pack1;

public class calculatorOverloading {

	
	public void add(int a,int b) {
		System.out.println("a+b:"+a+b);
		
	}
	
	public void add(int a,int b,int c) {
		System.out.println("a+b+c:"+a+b+c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatorOverloading obj1 = new calculatorOverloading();
		obj1.add(2, 4);
		obj1.add(3, 4,6);
		

	}

}
