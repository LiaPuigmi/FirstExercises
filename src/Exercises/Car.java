package Exercises;

import java.awt.Color;

public class Car {
	private String model;
	private String marca;
	private Color color;
	private int fuel;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	public Car(String model, String marca, Color color, int fuel) {
		this.model = model;
		this.marca = marca;
		this.color = color;
		this.fuel = fuel;
	}
	public Car() {
	}
	
	public int driveFuel() {
		fuel-=5;
		return fuel;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", marca=" + marca + ", color=" + color + ", fuel=" + fuel + "]";
	}
	
	
	
}
