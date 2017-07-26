package OverRiding;

public class Child_DynamicOverriding extends Parent_DynamicOverriding{

	public void disp(){
	      System.out.println("disp() method of Child class");
	   }
	   public void xyz(){
	      System.out.println("xyz() method of Child class");
	   }
	   public static void main( String args[]) {
	      //Parent class reference to child class object
		  Parent_DynamicOverriding obj = new Child_DynamicOverriding();
	      obj.disp();
	      obj.abc();
//	      obj.xyz();    
/* Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method xyz() is undefined for the type Parent_DynamicOverriding

	at OverRiding.Child_DynamicOverriding.main(Child_DynamicOverriding.java:16)*/
	   }
	}