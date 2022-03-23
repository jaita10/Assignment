package com.training.assessment;

public class Sphere extends Circle implements Volume{

	Sphere(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getVolume()
	{
		return 4/3 * 3.14 * radius * radius * radius;
	}

	
}
