package demo.USTS.chapter5;

public class Text5_2 {

	public static void main(String[] args) {
		/*����һ�������̵����ϵͳ��ϵͳ������ΪStockItem����Ʒ�����ࡣ
		 * stockItem���������ԣ���Ʒ��ţ���Ʒ���ƣ���Ʒ�۸�͵�ǰ�洢����Ʒ����
		 * ǰ����������Ҫ�ڶ��󴴽�ʱ���趨�������췽�������ã������Ʒ�����ڶ��󴴽�ʱ����Ϊ0
		 * ��Ʒ��������仯���Ʒ����Ӧ�ñ��޸�
		 * ���еķ����У�
		 * 1���ڶ���������������������۸�ķ�����
		 * 2������һ�����Ͳ�����������ӵ�ͬ����Ʒ��������
		 * 3��������Ʒ�ܼ�ֵ�ķ���
		 * 4����ȡ�ĸ����Եķ���
		 * 5����дstockItem��ķ���
		 * 6����д����stockItem��Ĳ��Գ���Ҫ�󴴽�һ������TV�������������200̨����ʾ����ܼ�ֵ
		 * 7�����һ������salasTax�������Ե�ֵ�������ÿһ������һ����д�������������
		 * 8�����һ����ΪsetSalesTax�ķ�����������double���͵Ĳ�����
		 * ����ֵ��ֵ����Ʒ˰���дһ�д��룬���������ж������Ʒ˰���趨Ϊ8��
              �����������κε��ض�����
		 * */
		TestStockItem T1 = new TestStockItem();
		T1.test();
	}

}
//���������
class TestStockItem
{
	StockItem item_TV = new StockItem(1, "TV", 1999);
	public void test()
	{
		item_TV.increaseTotalStock(200);
		item_TV.setM_SalesTax(8);
		System.out.println("����ܼ�ֵ��"+item_TV.calculateTotalPrice());
		
	}
}

//stockItem��
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
