package demo.USTS.chapter5;

public class Text5_2 {

	public static void main(String[] args) {
		/*开发一个电器商店管理系统。系统中有名为StockItem（商品）的类。
		 * stockItem有以下属性：货品编号，货品名称，商品价格和当前存储的商品总数
		 * 前三个属性需要在对象创建时被设定（即构造方法中设置）。库存品总数在对象创建时设置为0
		 * 货品创建后库存变化与货品名不应该被修改
		 * 类中的方法有：
		 * 1、在对象生命周期内允许重设价格的方法、
		 * 2、接受一个整型参数，将它添加到同类商品的总数中
		 * 3、返回商品总价值的方法
		 * 4、读取四个属性的方法
		 * 5、编写stockItem类的方法
		 * 6、编写测试stockItem类的测试程序，要求创建一个电器TV，将库存量增加200台，显示库存总价值
		 * 7、添加一个属性salasTax。该属性的值对于类的每一个对象都一样编写该语句的声明语句
		 * 8、添加一个名为setSalesTax的方法，他接收double类型的参数，
		 * 将该值赋值给商品税款。编写一行代码，将该类所有对象的商品税款设定为8，
              但不能引用任何的特定对象。
		 * */
		TestStockItem T1 = new TestStockItem();
		T1.test();
	}

}
//测试类程序
class TestStockItem
{
	StockItem item_TV = new StockItem(1, "TV", 1999);
	public void test()
	{
		item_TV.increaseTotalStock(200);
		item_TV.setM_SalesTax(8);
		System.out.println("库存总价值："+item_TV.calculateTotalPrice());
		
	}
}

//stockItem类
class StockItem
{
	private int m_ItemSerialNum;
	private String m_ItemName;
	private double m_ItemPrice;
	private int m_TotalNum = 0;
	private double m_salesTax;
	
	public StockItem(int ItemSerialNum,String ItemName,double ItemPrice)
	{
		this.m_ItemSerialNum = ItemSerialNum;
		this.m_ItemName = ItemName;
		this.m_ItemPrice = ItemPrice;
	}

	public double getM_ItemPrice() {
		return m_ItemPrice;
	}

	public void setM_ItemPrice(double m_ItemPrice) {
		this.m_ItemPrice = m_ItemPrice;
	}

	public int getM_ItemSerialNum() {
		return m_ItemSerialNum;
	}

	public String getM_ItemName() {
		return m_ItemName;
	}

	public int getM_TotalNum() {
		return m_TotalNum;
	}
	
	public void setM_SalesTax(double tax)
	{
		this.m_salesTax = tax;
	}
	
	public void increaseTotalStock(int num)
	{
		this.m_TotalNum += num;
	}
	
	public double calculateTotalPrice()
	{
		double price;
		price = this.m_ItemPrice*this.m_TotalNum;
		return price;
	}
}
