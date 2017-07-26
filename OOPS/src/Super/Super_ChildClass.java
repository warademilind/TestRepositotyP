package Super;

public class Super_ChildClass extends Super_BaseClass {
	public Super_ChildClass(){
		super();
		System.out.println("Super_ChildClass constructor");
	}
	public void display(){
		super.display();
		System.out.println("Super_ChildClass method display");
	} 
	void colour(){
		 System.out.println("White");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_ChildClass scc=new Super_ChildClass();
		scc.display();
		scc.colour();
		Super_BaseClass sbc=new Super_BaseClass();
		sbc.colour();
		

	}

}
