package com.training.assessment;

public class Circle extends Shape implements Area{
	
	public double radius;
	
	Circle(String n, double r)
	{
		super(n);
		this.radius = r;	
	}
	
	@Override
	public double getArea()
	{
		return (22.0/7.0)* radius * radius ;
	}


}
