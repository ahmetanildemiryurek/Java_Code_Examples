package onlineShoppingLogic;

public class ProductManager {
	public void addToBasket(Product product) {
		System.out.println(product.getUnitAmount()+" adet " +product.getName()+" sepete eklendi !");
		System.out.println("\n");
	}

}
