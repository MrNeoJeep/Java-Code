package demo.USTS.chapter7;


public class Text7_3 {

	public static void main(String[] args) {
		/* 根据UML图编写4个类：
		 * 1、phone抽象类，含有抽象方法打电话
		 * 2、Ebook接口，含有抽象方法read（）。
		 * 3、PadPhone继承了Phone抽象类并实现了Ebook接口
		 * call方法输出：**品牌的手机在打电话
		 * read方法输出：**品牌的电子书在阅读
		 * 4、测试类Test含有main方法，方法中创建品牌为huawei的对象，调用call方法和read方法
		 * */
		testPadPhone test = new testPadPhone();//在堆区开辟数据，由jvm虚拟机实现回收资源
		test.main(args);		
	}

}
//编写测试类
class testPadPhone
{
	public void main(String [] args)
	{
		PadPhone p1 = new PadPhone("HuaWei");
		p1.Call();
		p1.read();
	}
	
	
}
//编写padPhone类
class PadPhone extends Phone implements Ebook
{
	private String m_brand;
	public PadPhone(String brand) {
		this.m_brand = brand;
	}
	
	public void Call()
	{
		System.out.println(this.m_brand+"品牌的手机在打电话。");
	}
	public void read()
	{
		System.out.println(this.m_brand+"品牌的电子书在阅读。");
	}
}
//编写Ebook的接口
interface Ebook
{
	abstract void read();
}

//编写phone的抽象类
abstract class Phone
{
	abstract void Call();
}

