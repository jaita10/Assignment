package com.training.assessment;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = sc.nextDouble();
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		System.out.println("Enter the height: ");
		double height = sc.nextDouble();
		
		
		Circle cir = new Circle("Circle",radius);
		System.out.println("--------------------");
		System.out.println("Name of the Shape: "+cir.getName());
		System.out.println("Area of the Shape: "+cir.getArea());
		
		System.out.println();

		Square sq = new Square("Square",side);
		System.out.println("--------------------");
		System.out.println("Name of the Shape: "+sq.getName());
		System.out.println("Area of the Shape: "+sq.getArea());;
		
		System.out.println();

		Cylinder cld = new Cylinder("Cylinder",radius,height);
		System.out.println("--------------------");
		System.out.println("Name of the Shape: "+cld.getName());
		System.out.println("Volume of the Shape: "+cld.getVolume());
		
		System.out.println();

		Sphere sph = new Sphere("Sphere",radius);
		System.out.println("--------------------");
		System.out.println("Name of the Shape: "+sph.getName());
		System.out.println("Volume of the Shape: "+sph.getVolume());
		
		System.out.println();

		Cube cb = new Cube("Cube",radius);
		System.out.println("--------------------");
		System.out.println("Name of the Shape: "+cb.getName());
		System.out.println("Volume of the Shape: "+cb.getVolume());
		
		System.out.println();

		Glome gm = new Glome("Glome",radius);
		System.out.println("--------------------");
		System.out.println("Name of the Shape: "+gm.getName());
		System.out.println("Volume of the Shape: "+gm.getVolume());

	}

}
