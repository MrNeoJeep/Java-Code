package demo.USTS.chapter6;

public class Text6_1 {

	public static void main(String[] args) {
		/* 设计一个灯泡类，灯泡类的私有属性有颜色（String），功率（int）和状态（boolean）
		 * 灯泡类带有参数构造方法；开灯方法（状态改为true）；关灯方法（false）
		 * 将Light类打入oop.edu中
		 * 然后设计测试类。创建三盏灯红绿蓝，功率为5W，10W,20W的灯。开启三盏灯后再熄灭红色灯
		 * */
		//测试
		TestLight testLight = new TestLight();
		testLight.turnOnLight1();
		testLight.turnOnLight2();
		testLight.turnOnLight3();
		if(testLight.L1.getState() == true||testLight.L2.getState() == true
			||	testLight.L3.getState() == true)
		{
			testLight.turnOffLight1();
		}
		

	}

}
//创建测试类
class TestLight
{
	Light L1 = new Light("Red", 5, false);
	Light L2 = new Light("Green", 10, false);
	Light L3 = new Light("Blue", 20, false);
	public void turnOnLight1()
	{
		L1.setState(true);
		System.out.println("已打开红色灯");
		
	}
	public void turnOnLight2()
	{
		L2.setState(true);
		System.out.println("已打开绿色灯");
	}
	public void turnOnLight3()
	{
		L3.setState(true);
		System.out.println("已打开蓝色灯");
	}
	public void turnOffLight1()
	{
		L1.setState(false);
		System.out.println("已关闭红色灯");
		
	}
	public void turnOffLight2()
	{
		L2.setState(false);
		System.out.println("已关闭绿色灯");
	}
	public void turnOffLight3()
	{
		L3.setState(false);
		System.out.println("已关闭蓝色灯");
	}
}

//创建灯类
class Light
{
	private String color;
	private int power;
	private boolean state;
	public Light(String color,int power,boolean state) 
	{
		this.color = color;
		this.power = power;
		this.state = state;
	}
	public void setState(boolean flag) {
		this.state = flag;
	}
	public boolean getState() {
		return this.state;
	}
}
