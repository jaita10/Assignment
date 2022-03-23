package com.training.assessment;

public class Glome extends Sphere implements Volume{

	Glome(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getVolume()
	{
		return 2 * 3.14 * 3.14 * radius * radius * radius;
	}


}
