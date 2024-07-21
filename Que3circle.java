package com.task6;

public class Que3circle {
	
    	//static block->it is part of class
		static {
			System.out.println("this is static block");
		}
		
		//instance block->it is part of object
		{
			System.out.println("this is a instance block");
				
		}
		
		//constructor->no-parameterized 
		Que3circle(){
			System.out.println("0-argument circle constructor");
		}
		
		//constructor->parameterized
		Que3circle(int radius) {
			System.out.println("2-argument circle constructor");
			//initialize radius
			this.radius=radius;//100;
		}	
		
		//define data member
		int radius;
		
		//method-1
		public int getcircumference(int radius) {
			
			return 2 * 22/7 * radius ;
		}
		
		//main method
	   public static void main(String[] args) {
		//reference variable->can be used to refer the object
		   Que3circle c1=new Que3circle(14);
		//method to calculate circumference of circle
		   System.out.println(c1.getcircumference(14));

	}

}
