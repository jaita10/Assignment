package com.training.assessment;

public class Square extends Shape implements Area{
	
	public double side;
	
	Square(String n, double s)
	{
		super(n);
		this.side = s;	
	}
	
	@Override
	public double getArea()
	{
		return side * side ;
	}

}
