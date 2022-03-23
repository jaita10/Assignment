package com.training.assessment;

public class Cube extends Square implements Volume{

	Cube(String n, double s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getVolume()
	{
		return side * side * side;
	}

}
