package it.unirc.pojo.purchase;

import java.util.ArrayList;

import it.unirc.pojo.purchase.Purchase;


	public interface PurchaseDAO {
		public Purchase getPurchase(Purchase p);
		public boolean insertPurchase(Purchase p);
		public boolean editPurchase(Purchase p);
		public int maxQuantity();
		public ArrayList<Purchase> getUserPurchasesJSON(int idCustomer);
}
