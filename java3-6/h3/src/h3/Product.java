package h3;

public class Product {

	private String sno;
	private String name;
	private int num;
	private double price;
	private double totalPrice;
	
	public Product(String sno,String name,int num,double price,double totalPrice){
		this.sno=sno;
		this.name=name;
		this.num=num;
		this.price=price;
		this.totalPrice=totalPrice;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "\n"+sno + "\t" + name + "\t" + num + "\t" + price + "\t"+ totalPrice ;
	}
	
}
