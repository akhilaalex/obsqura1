package accessmodifier1;

public class accessTeachers {
	
	
	private class teacherPrivate{
		private int d=6;
		private void display_private() {
			
			System.out.println("\n\n iside private class");
			}
		public void display() {
			teacherPrivate obj=new teacherPrivate();
			obj.display_private();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	accessTeachers obj1=new accessTeachers();
	obj1.display();
	}

}
