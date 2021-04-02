package demo.USTS.chapter7;


public class Text7_2 {

	public static void main(String[] args) {
		/* �о��κ��������࣬������ͼ��д���롣��д������
		 * ���ɾ��κ���������󣬵��ü������ʾ������
		 * */
		testRect test1 = new testRect();
		test1.test();
	}

}
//������
class testRect
{
	public void test()
	{
		Box box1 = new Box(3, 4, 5);
		box1.print();
	}
}
//��������
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
	//���
	public double box_area()
	{
		double area = 2*super.m_length*super.m_width+2*super.m_length*this.m_height+
				2*super.m_width*this.m_height;
		return area;
	}
	//�ܳ�
	public double volume()
	{
		return this.m_height*this.m_length*this.m_width;
	}
	
	public void print()
	{
		System.out.println("������ı����Ϊ��"+this.box_area()+"������������"+this.volume());
		super.print();
	}
}


//������
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
	
	//���
	public double area()
	{
		return this.m_length*this.m_width;
	}
	//�ܳ�
	public double perimeter()
	{
		return 2*(this.m_length+this.m_width);
	}
	
	public void print()
	{
		double area = area();
		double perimeter = perimeter();
		System.out.println("���ε����Ϊ��"+ area + "���ܳ�Ϊ��"+ perimeter);
	}
	
}