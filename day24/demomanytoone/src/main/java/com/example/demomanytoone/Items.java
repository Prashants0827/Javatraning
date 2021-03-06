package com.example.demomanytoone;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Items {
	@Id
	int item_id;
String item_desc;
int item_cost;
@ManyToOne
@JoinColumn(name="cart_id")
private Cart cart_obj;
public int getItem_id() {
	return item_id;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public String getItem_desc() {
	return item_desc;
}
public void setItem_desc(String item_desc) {
	this.item_desc = item_desc;
}
public int getItem_cost() {
	return item_cost;
}
public void setItem_cost(int item_cost) {
	this.item_cost = item_cost;
}
public Cart getCartobj() {
	return cart_obj;
}
public void setCartobj(Cart car_tobj) {
	this.cart_obj = cart_obj;
}
public Items(int item_id, String item_desc, int item_cost, Cart cart_obj) {
	super();
	this.item_id = item_id;
	this.item_desc = item_desc;
	this.item_cost = item_cost;
	this.cart_obj = cart_obj;
}

}
