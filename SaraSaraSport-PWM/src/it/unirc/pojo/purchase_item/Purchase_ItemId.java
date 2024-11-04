package it.unirc.pojo.purchase_item;

public class Purchase_ItemId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
		private int number;
		private int year;
		private int idItem;
		
		public Purchase_ItemId() {
			super();
			// TODO Auto-generated constructor stub
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
		public int getIdItem() {
			return idItem;
		}
		public void setIdItem(int idItem) {
			this.idItem = idItem;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Purchase_ItemId(int number, int year, int idItem) {
			super();
			this.number = number;
			this.year = year;
			this.idItem = idItem;
		}
		@Override
		public String toString() {
			return "Purchase_ItemId [number=" + number + ", year=" + year + ", idItem=" + idItem + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idItem;
			result = prime * result + number;
			result = prime * result + year;
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
			Purchase_ItemId other = (Purchase_ItemId) obj;
			if (idItem != other.idItem)
				return false;
			if (number != other.number)
				return false;
			if (year != other.year)
				return false;
			return true;
		}
		
		
}
