package com.training.assessment;

public class Box {
		
		double l, b, h;
		
		//This is the constructor
		Box(double length, double breadth, double height){
			l=length;
			b=breadth;
			h=height;
		}
		//Function volume
		//Return volume
		double volume() {
			double v;
			v = l*b*h;
			return v;
		}

		public static void main(String[] args) {
			
			Box b = new Box(5.8,66,7);
			
			double vol;
			
			vol= b.volume();
			
			System.out.println("The volume of the box is : "+ vol);

		}
}
