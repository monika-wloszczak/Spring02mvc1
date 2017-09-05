package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {
	Cart cart;

	public Cart getCart() {
		return cart;
	}

	@Autowired
	@Qualifier("koszyk")
	public void setCart(Cart cart){
		this.cart = cart;
	}
@RequestMapping("/addtocart")
	@ResponseBody
	public String addToCart(){
	cart.addCartItem(new CartItem(2, new Product("jablko", 2.99)));
	cart.addCartItem(new CartItem(4, new Product("bulka", 1.00)));
		return "dodano";
	}

@RequestMapping("/cart")
@ResponseBody
public String cart(Model model){
	model.addAttribute("cart", cart.getList());
	StringBuilder sb = new StringBuilder();
	for(CartItem ci:cart.getList()){
		sb.append(ci.toString()).append("<br>");
	}
	return sb.toString();
}
}
