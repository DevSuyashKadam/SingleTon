
 class Student {

	private static Student std=null;  //it is class reference
	
	int roll_num=11;
	String name="Suyash";
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	static Student getObj() {
		
		if(std==null) {
			std=new Student();
			System.out.println("\n Student onj created.........!!!!");
		}
		return std;

	}
	
	
}

public class Employee{
	
	public static void main(String[] args) {
		Student s1=Student.getObj();
		Student s2=Student.getObj();
		Student s3=Student.getObj();
		
		
		
		System.out.println("The objects are same"+(s1==s2));
		System.out.println("The objects are same"+(s2.equals(s3)));

		
	}
	
	
}
