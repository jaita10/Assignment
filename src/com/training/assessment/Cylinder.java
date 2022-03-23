package com.training.assessment;

public class Cylinder extends Circle implements Volume{
	
	double height;
	
	Cylinder(String n, double r, double h) {
		super(n, r);
		// TODO Auto-generated constructor stub
		this.height=h;
	}
	
	@Override
	public double getVolume()
	{
		return 3.14 * radius * radius * height;
	}


}
