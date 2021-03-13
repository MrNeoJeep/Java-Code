package demo.USTS.chapter2;



public class Main_Ways {

	public static void main(String[] args) {
		Phone_class p = new Phone_class();
		p.brand = "华为";
		p.price = 6999;
		System.out.println(p.brand + "的价格为：" + p.price);
		p.call();
		p.send_mes();
		double a = 2.33;
		for(int i = 0; i <10 ;i++)
		{
			System.out.println(i);
		}
	    System.out.println(9/2);
	    System.out.println((char)('b'+3));

	}
	

}
