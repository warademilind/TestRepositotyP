package ExceptionHandling_Overriding;

import java.io.IOException;

public class ChildClass_Room extends BaseClass_Building {

		// TODO Auto-generated method stub
		void color() throws IOException
		   {
		      System.out.println("White");
		   }  
		   public static void main(String args[]){  
			   BaseClass_Building obj = new ChildClass_Room();  
		      try{
		         obj.color();
		      }catch(Exception e){
		         System.out.println(e);
		       }
		   } 
		}