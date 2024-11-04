package it.unirc.pojo.purchase;

import it.unirc.pojo.purchase.PurchaseId;

public class PurchaseId implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private int number;
	private int year;

	public PurchaseId(int number, int year) {
		super();
		this.number = number;
		this.year = year;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public PurchaseId() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + year;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseId other = (PurchaseId) obj;
		if (year != other.year)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PurchaseId [number=" + number + ", year=" + year + "]";
	}



}
