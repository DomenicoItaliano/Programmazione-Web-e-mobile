package it.unirc.pojo.item;


import java.util.List;

import it.unirc.pojo.item.Item;

import java.util.ArrayList;

public interface ItemDAO {
	public Item getItem(Item i);
	public boolean insertItem(Item i);
	public boolean editItem(Item i);
	public boolean deleteItem(Item i);
	public List<Item> getItems();
	public ArrayList<Item> getItemsJSON();
	public List<Item> getAvailableItems();
	public List<Item> getItembyCategory(String category);
	public List<Item> getItembyDescription(String description, String category);
	public List<Item> getItembyName(String name, String category);
	public int maxStockQuantity();
}
