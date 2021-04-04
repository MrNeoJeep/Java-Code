package demo.USTS.chapter8;

public class Text8_1 {

	public static void main(String[] args) {
		/*��дһ��������Java Application���򣬰����ӿ�ShapeArea��Circle�࣬test��
		 * ����Ҫ������
		 * 1���ӿ�Shape
		 * �ӿڷ�����
		 * double getArea��������һ����״�����
		 * double getPerimeter��������һ����״���ܳ�
		 * 2��Circle��
		 * ʵ��Shape�ӿڣ��������µ����Ժͷ�����
		 * ������radius��double���ͣ���ʾԲ�İ뾶
		 * ������
		 * circle��double r�������캯��
		 * toString()���������Բ��������Ϣ������radius = 1.0��perimeter = 6.28
		 * area = 3.14
		 * 3��Test����Ϊ����Ҫ��ɲ��Թ���
		 * ����circle����
		 * ���ö����tostring�ķ�������������������Ϣ
		 * 4��������״�࣬����һ��Square�࣬Ȼ���ɲ��������������������״�����࣬���������
		 * ������һ��circle����ż������һ��Square���󡣽����ɵĶ���ֵ��Shape�ӿھ��
		 * �������������״���ܳ������
		 * ��д���·��������������
		 * public static void testShape(shape shape)
		 * �Ѹ÷������������صķ������бȽϣ�
		 * public static void testShape(circle circle)
		 * public static void testShape(square square)
		 * 
		 * ���ǣ���������Ӽ��־������״�࣬ʵ���������ܵ����ַ�ʽӦ����δ��������ӵ���״��
		 * */
		Test t1 = new Test();
		t1.test();
		t1.testShape(t1.choice());

	}

}
//��дTest��
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
//����Square��
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
		return "���εĳ�Ϊ��"+ this.c+"���εĿ�Ϊ��"+this.k+"���ε��ܳ���"+this.getPerimeter()+"���ε������"+this.getArea();
	}
}
//Circle��
class Circle implements Shape
{
	
	private double radius; //Բ�İ뾶
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
		return "Բ�İ뾶��"+this.radius+"Բ���ܳ��ǣ�"+this.getPerimeter()+"Բ�������"+this.getArea();
	}
}

//�ӿ�shape
interface Shape
{
	double getArea();
	double getPerimeter();
	
}
