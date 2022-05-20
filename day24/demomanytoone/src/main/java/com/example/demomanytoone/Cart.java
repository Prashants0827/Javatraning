package com.example.demomanytoone;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cart {
	@Id
	private int Cart_id;
	private String uname;
@OneToMany(mappedBy="cart_obj")
   private Set<Items>items;
public Cart() {
}
   public int getCart_id() {
	return Cart_id;
}
public void setCart_id(int cart_id) {
	Cart_id = cart_id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public Set<Items> getItems() {
	return items;
}
public void setItems(Set<Items> items) {
	this.items = items;
}
public Cart(int cart_id, String uname) {
	super();
	Cart_id = cart_id;
	this.uname = uname;

}

}
