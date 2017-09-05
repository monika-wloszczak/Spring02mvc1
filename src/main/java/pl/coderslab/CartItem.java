package pl.coderslab;

public class CartItem {
int quantity;
Product product;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public CartItem(int quantity, Product product) {
	super();
	this.quantity = quantity;
	this.product = product;
}
@Override
public String toString() {
	return "CartItem [quantity=" + quantity + ", product=" + product + "]";
}


}
