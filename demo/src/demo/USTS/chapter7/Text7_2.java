package demo.USTS.chapter7;


public class Text7_2 {

	public static void main(String[] args) {
		/* 有矩形和立方体类，根据类图编写代码。编写测试类
		 * 生成矩形和立方体对象，调用计算和显示方法。
		 * */
		testRect test1 = new testRect();
		test1.test();
	}

}
//测试类
class testRect
{
	public void test()
	{
		Box box1 = new Box(3, 4, 5);
		box1.print();
	}
}
//立方体类
class Box extends Rectangle
{
	private double m_height;
	
	public Box(double length,double width,double height) {
		super(length,width);
		this.m_height = height;
	}

	public double getM_height() {
		return m_height;
	}
	//面积
	public double box_area()
	{
		double area = 2*super.m_length*super.m_width+2*super.m_length*this.m_height+
				2*super.m_width*this.m_height;
		return area;
	}
	//周长
	public double volume()
	{
		return this.m_height*this.m_length*this.m_width;
	}
	
	public void print()
	{
		System.out.println("立方体的表面积为："+this.box_area()+"立方体的体积："+this.volume());
		super.print();
	}
}


//矩形类
class Rectangle
{
	protected double m_length;
	protected double m_width;
	
	public Rectangle() {}
	public Rectangle(double length,double width)
	{
		this.m_length = length;
		this.m_width = width;
	}
	public double getM_length() {
		return m_length;
	}
	public double getM_width() {
		return m_width;
	}
	
	//面积
	public double area()
	{
		return this.m_length*this.m_width;
	}
	//周长
	public double perimeter()
	{
		return 2*(this.m_length+this.m_width);
	}
	
	public void print()
	{
		double area = area();
		double perimeter = perimeter();
		System.out.println("矩形的面积为："+ area + "。周长为："+ perimeter);
	}
	
}