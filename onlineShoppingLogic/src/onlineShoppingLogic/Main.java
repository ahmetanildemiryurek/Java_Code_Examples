package onlineShoppingLogic;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Ürün-1");
		product1.setDetail("Ayakkabi");
		product1.setUnitAmount(1);
		product1.setUnitPrice(650.85);
		product1.setColor("Sari");
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Ürün-2");
		product2.setDetail("Elbise");
		product2.setUnitAmount(2);
		product2.setUnitPrice(450.85);
		product2.setColor("Lacivert");
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Ürün-3");
		product3.setDetail("Pantolon");
		product3.setUnitAmount(3);
		product3.setUnitPrice(350.85);
		product3.setColor("Mavi");
		
		
		Product[] products = {product1 , product2 ,product3};
		for(Product product : products) {

			System.out.println(product.getUnitAmount()+" tane "+product.getDetail());
			ProductManager productManager = new ProductManager();
			productManager.addToBasket(product);
			
			
		}
		
		Shoes shoes = new Shoes();
		shoes.setNumber(42);
		
		Dress dress = new Dress();
		dress.setSize("Medium");
		
		Trousers trousers = new Trousers();
		trousers.setType("Ýspanyol Paca");
		

		ShoesManager shoesManager = new ShoesManager(); 
		shoesManager.printNumber(shoes);
		
		DressManager dressManager = new DressManager();
		dressManager.printSize(dress);
		
		TrousersManager trousersManager = new TrousersManager();
		trousersManager.printSize(trousers);
	}

}
