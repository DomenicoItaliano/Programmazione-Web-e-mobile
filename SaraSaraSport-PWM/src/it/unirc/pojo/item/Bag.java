package it.unirc.pojo.item;

public class Bag extends Item{
	private String dimension;

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Bag(String dimension) {
		super();
		this.dimension = dimension;
	}

	public Bag() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
