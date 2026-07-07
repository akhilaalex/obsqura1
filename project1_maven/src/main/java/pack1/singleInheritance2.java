package pack1;

public class singleInheritance2 extends singleInheritance1{
	
	int bonus=788;
	
public void salarycalc() {
	System.out.println("taotal salary : "+(bonus+salary));
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	singleInheritance2 obj = new singleInheritance2();
	obj.salarycalc();
	System.out.println(obj.bonus);
	System.out.println(obj.salary);
	
}
}


