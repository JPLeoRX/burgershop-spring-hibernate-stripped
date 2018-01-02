package org.moskito.demo.burgershop.burgershopstripped.service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 17.11.13 20:40
 */
public class Order {
	private int id;
	private String itemMeat;
	private String itemBread;
	private String itemExtra;

	private List<ShopableItem> items;
	private int totalPrice;

	public Order(){
		items = new ArrayList<ShopableItem>();
	}

	public void addItem(ShopableItem item){
		if (item.getCategory() == Category.MEAT)
			itemMeat = item.getName();
		else if (item.getCategory() == Category.BREAD)
			itemBread = item.getName();
		else
			itemExtra = item.getName();

		items.add(item);
		totalPrice += item.getPrice();
	}

	public int getId() {
		return id;
	}

	public String getItemMeat() {
		return itemMeat;
	}

	public String getItemBread() {
		return itemBread;
	}

	public String getItemExtra() {
		return itemExtra;
	}

	public List<ShopableItem> getItems() {
		return items;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItemMeat(String itemMeat) {
		this.itemMeat = itemMeat;
	}

	public void setItemBread(String itemBread) {
		this.itemBread = itemBread;
	}

	public void setItemExtra(String itemExtra) {
		this.itemExtra = itemExtra;
	}

	public void setItems(List<ShopableItem> items) {
		this.items = items;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String toString(){
		return getTotalPrice()+" "+items;
	}
}