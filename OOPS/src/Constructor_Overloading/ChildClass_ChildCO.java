package Constructor_Overloading;

public class ChildClass_ChildCO extends BaseClass_ParentCO {

	public ChildClass_ChildCO(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		// Third commit for test
	}

	public static void main(String[] args) {
		BaseClass_ParentCO myobj=new BaseClass_ParentCO();
		System.out.println("Student Name is: "+myobj.getStuName());
	    System.out.println("Student Age is: "+myobj.getStuAge());
	    System.out.println("Student ID is: "+myobj.getStuID());
		
	    BaseClass_ParentCO myobj2 = new BaseClass_ParentCO(555, "Chaitanya", 25);
	    System.out.println("Student Name is: "+myobj2.getStuName());
	    System.out.println("Student Age is: "+myobj2.getStuAge());
	    System.out.println("Student ID is: "+myobj2.getStuID()); 
	}

}
