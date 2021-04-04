package demo.USTS.chapter8;

public class Text8_1 {

	public static void main(String[] args) {
		/*编写一个完整的Java Application程序，包含接口ShapeArea。Circle类，test类
		 * 具体要求如下
		 * 1、接口Shape
		 * 接口方法：
		 * double getArea（）：求一个形状的面积
		 * double getPerimeter（）：求一个形状的周长
		 * 2、Circle类
		 * 实现Shape接口，并有以下的属性和方法：
		 * 属性有radius：double类型，表示圆的半径
		 * 方法：
		 * circle（double r）：构造函数
		 * toString()方法：输出圆的描述信息，，如radius = 1.0，perimeter = 6.28
		 * area = 3.14
		 * 3、Test类作为主类要完成测试功能
		 * 生成circle对象
		 * 调用对象的tostring的方法，输出对象的描述信息
		 * 4、调用形状类，增加一个Square类，然后由产生的随机数决定生成形状的种类，如果是奇数
		 * 就生成一个circle对象，偶数生成一个Square对象。将生成的对象赋值给Shape接口句柄
		 * ，计算输出该形状的周长面积。
		 * 编写如下方法完成上述功能
		 * public static void testShape(shape shape)
		 * 把该方法与下列重载的方法进行比较：
		 * public static void testShape(circle circle)
		 * public static void testShape(square square)
		 * 
		 * 考虑：如果再增加几种具体的形状类，实现上述功能的两种方式应该如何处理新增加的形状类
		 * */
		Test t1 = new Test();
		t1.test();
		t1.testShape(t1.choice());

	}

}
//编写Test类
class Test
{
	public void test()
	{
		Circle c1 = new Circle(5);
		String string = c1.toString();
		System.out.println(string);
	}
	public Shape choice()
	{
		int num = (int)(Math.random()*100);
		if(num % 2 == 0)
		{
			Square s = new Square(2, 3);
			return s;
		}
		else {
			Circle c = new Circle(4);
			return c;
		}
	}
	public static void testShape(Shape shape)
	{
		String string = shape.toString();
		System.out.println(string);
	}
}
//增加Square类
class Square implements Shape
{
	private double c;
	private double k;
	public Square(double c,double k) {
		this.c = c;
		this.k = k;
	}
	
	public double getArea()
	{
		return c*k;
	}
	public double getPerimeter()
	{
		return 2*c+2*k;
	}
	public String toString()
	{
		return "方形的长为："+ this.c+"方形的宽为："+this.k+"方形的周长："+this.getPerimeter()+"方形的面积："+this.getArea();
	}
}
//Circle类
class Circle implements Shape
{
	
	private double radius; //圆的半径
	public Circle(double r) {
		this.radius = r;
	}
	public double getArea()
	{
		double s ;
		s = Math.PI*this.radius*this.radius;
		return s;
	}
	public double getPerimeter()
	{
		double l;
		l = 2*Math.PI*this.radius;
		return l;
	}
	public String toString()
	{
		return "圆的半径："+this.radius+"圆的周长是："+this.getPerimeter()+"圆的面积："+this.getArea();
	}
}

//接口shape
interface Shape
{
	double getArea();
	double getPerimeter();
	
}
