package demo.USTS.chapter2;

public class Phone_class 
{
	String brand;
	int price;
	public void send_mes()
	{
		System.out.println("���Ͷ���");
	}
	public void call()
	{
		System.out.println("����绰");
	}

}

class phone
{
	private String brand;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
