package accessmodifier1;

import pack1.singleInheritance2;

public class accessCollege {
	int a= 3;
	public void display() {
		System.out.println("public from same package a=:"+a);
	}
}

class deptProtected extends singleInheritance2{
	protected int b=3;
	protected void display_pro() {
		System.out.println("protected from same package b=:"+b);
	}
	
}

class coursedefault{
	int c=4;
	void display_default() {
		System.out.println("\n\ndefault from same package c+a="+c);
	}
	


}

	

class accessDemo{
	public static void main(String[] args) {
	
		accessCollege obj=new accessCollege();
		obj.display();
		System.out.println("public from a different package");
		singleInheritance2 obj1 = new singleInheritance2();
		obj1.salarycalc();
		
		
		System.out.println("\nprotected from same package");
		deptProtected obj2=new deptProtected();
		obj2.display_pro();
		System.out.println("protected from a different package by extends");
		obj2.salarycalc();
		
		
		coursedefault obj3 =new coursedefault();
		obj3.display_default();
}
}