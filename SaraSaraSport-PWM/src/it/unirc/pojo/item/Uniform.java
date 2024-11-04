package it.unirc.pojo.item;

public class Uniform extends Item {
	private String measure;

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public Uniform(String measure) {
		super();
		this.measure = measure;
	}

	public Uniform() {
		super();
		// TODO Auto-generated constructor stub
	} 

}
