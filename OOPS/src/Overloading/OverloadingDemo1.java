package Overloading;

public class OverloadingDemo1 {
	void disp(char c){
		System.out.println(c);
	}
	void disp(char c, int num){
		System.out.println(c+" "+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo1 old1=new OverloadingDemo1();
		old1.disp('d');
		old1.disp('c', 12);
		old1.disp('a');

	}

}
