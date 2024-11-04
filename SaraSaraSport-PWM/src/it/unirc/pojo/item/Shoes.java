package it.unirc.pojo.item;

public class Shoes extends Item {
	private double size;

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Shoes(double size) {
		super();
		this.size = size;
	}

	public Shoes() {
		super();
		// TODO Auto-generated constructor stub
	}

}