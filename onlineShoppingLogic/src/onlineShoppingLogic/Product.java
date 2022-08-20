package onlineShoppingLogic;

public class Product {
	
	private int id;
	private String name;
	private String detail;
	private int unitAmount;
	private double unitPrice;
	private String color;
	
	
	public Product () {
		//this(); ise herhangi bir sýnýfýn mevcut örneðini temsil eder.
		super(); //super bir üst sýnýfýn mevcur örneðini temsil eder.Biz Inheriteance yapýsýný kullanacaðýmýz için super();'i kullandýk.
	}
	public Product (int id , String name , String detail , int unitAmount , double unitPrice) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitAmount = unitAmount;
		this.unitPrice = unitAmount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	public int getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(int unitAmount) {
		this.unitAmount = unitAmount;
	}
	
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
