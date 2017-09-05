package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.annotation.ScopedProxyMode;


@Component("koszyk")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)   
public class Cart {
List <CartItem> list;
public Cart(){
	list=new ArrayList<CartItem>();
}

public List<CartItem> getList() {
	return list;
}

public void setList(List<CartItem> list) {
	this.list = list;
}
public void addCartItem(CartItem cartItem){
	list.add(cartItem);
}

public Cart(List<CartItem> list) {
	super();
	this.list = list;
}
}
