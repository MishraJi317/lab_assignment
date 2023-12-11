package com.springdemo.DependancyInjection;

//implementing dependency injection through setters
public class Rectangle implements Shape{
	
	private String color;
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("drawing a "+color+" rectangle");
		
	}

}
