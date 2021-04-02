package demo.USTS.chapter7;

import java.util.Scanner;

public class Text7_1 {

	public static void main(String[] args) {
		/*设计Vehicle类，包含的属性有注册码，制造商，生产年份和价格
		 * 要求：前三个属性在创建时设置，价格允许改变。能够读取上述所有属性。
		 * 重写tostring方法，使输出格式为：
		 * 注册码： ***，车辆制造商：***，生产年份：****，
		 * 价格是：****元。
		 * 提供一个方法，接收一个年月日作为输入，返回车辆的年龄。
		 * 设计vechile类的子类SecondHandVehicle。
		 * 子类具有额外的属性numberOfOwner，该属性在创建时被设置，并具有读取操作。提供一个
		 * 方法返回二手车的交易次数。
		 * 编写测试类，测试上述类的所有方法。
		 * */
		testVehicle test1 = new testVehicle();
		test1.test();
	}

}
//测试类的编写
class testVehicle
{
	public void test()
	{
		SecondHandVehicle car = new SecondHandVehicle("A1", "比亚迪", 2019, 1);
		car.setM_price(190000);
		System.out.println("车辆基本信息"+car.toString());
		System.out.println(car.getM_registerCode()+"的价格为："+car.getM_price());
		System.out.println("制造商为："+car.getM_maker());
		System.out.println("这款车的交易次数为："+car.calNum());
		int num = car.calu();
		System.out.println("这款车的车龄为："+num);
		
		
	}
}
//子类二手车
class SecondHandVehicle extends Vehicle
{
	int numberOfOwner;
	//调用父类的构造方法
	public SecondHandVehicle(String registerCode, String maker, int year,int numberOfOwner) {
		super(registerCode, maker, year);
		this.numberOfOwner = numberOfOwner;
	}
	public int calNum()
	{
		return this.numberOfOwner;
	}
	
}

//设计父类Vehicle
class Vehicle
{
	private String m_registerCode;
	private String m_maker;
	private int m_year;
	private double m_price = 0;
	
	//构造方法
	public Vehicle(String registerCode,String maker,int year) {
		this.m_registerCode = registerCode;
		this.m_maker = maker;
		this.m_year = year;
	}

	public double getM_price() {
		if(this.m_price ==0)
		{
			System.out.println("未设置价格");
			return 0;
		}
		else {
			return m_price;
		}
		
	}

	public void setM_price(double m_price) {
		this.m_price = m_price;
	}

	public String getM_registerCode() {
		return m_registerCode;
	}

	public String getM_maker() {
		return m_maker;
	}

	public int getM_year() {
		return m_year;
	}
	//重写tostring
	public String toString()
	{
		return "注册码是："+this.m_registerCode+","+"车辆制造商："+this.m_maker+","+"生产年份："+this.m_year+","+
					"价格是："+this.m_price+"元。"; 
	}
	
	public int calu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年月日(用逗号分隔)：");
		String []arr = sc.nextLine().split(",");
		int in_year =Integer.parseInt(arr[0]) ;
		int in_month = Integer.parseInt(arr[1]);
		int in_day = Integer.parseInt(arr[2]);
		//System.out.printf("%d,%d,%d\n",in_year,in_month,in_day);
		//建立一个日期数组,默认车辆均由当年一月一日制造
		int day[] = {0,31,59,90,120,151,181,212,243,273,304,334};
		if(in_year < this.m_year)
		{
			System.out.println("输入有误");
			return 0;
		}
		else {
			int res = (in_year-this.m_year)*365 + day[in_month] + in_day;
			return res;
		}
		
		
	}
	
	
	
}