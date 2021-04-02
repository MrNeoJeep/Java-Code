package demo.USTS.chapter7;

import java.util.Scanner;

public class Text7_1 {

	public static void main(String[] args) {
		/*���Vehicle�࣬������������ע���룬�����̣�������ݺͼ۸�
		 * Ҫ��ǰ���������ڴ���ʱ���ã��۸�����ı䡣�ܹ���ȡ�����������ԡ�
		 * ��дtostring������ʹ�����ʽΪ��
		 * ע���룺 ***�����������̣�***��������ݣ�****��
		 * �۸��ǣ�****Ԫ��
		 * �ṩһ������������һ����������Ϊ���룬���س��������䡣
		 * ���vechile�������SecondHandVehicle��
		 * ������ж��������numberOfOwner���������ڴ���ʱ�����ã������ж�ȡ�������ṩһ��
		 * �������ض��ֳ��Ľ��״�����
		 * ��д�����࣬��������������з�����
		 * */
		testVehicle test1 = new testVehicle();
		test1.test();
	}

}
//������ı�д
class testVehicle
{
	public void test()
	{
		SecondHandVehicle car = new SecondHandVehicle("A1", "���ǵ�", 2019, 1);
		car.setM_price(190000);
		System.out.println("����������Ϣ"+car.toString());
		System.out.println(car.getM_registerCode()+"�ļ۸�Ϊ��"+car.getM_price());
		System.out.println("������Ϊ��"+car.getM_maker());
		System.out.println("���Ľ��״���Ϊ��"+car.calNum());
		int num = car.calu();
		System.out.println("���ĳ���Ϊ��"+num);
		
		
	}
}
//������ֳ�
class SecondHandVehicle extends Vehicle
{
	int numberOfOwner;
	//���ø���Ĺ��췽��
	public SecondHandVehicle(String registerCode, String maker, int year,int numberOfOwner) {
		super(registerCode, maker, year);
		this.numberOfOwner = numberOfOwner;
	}
	public int calNum()
	{
		return this.numberOfOwner;
	}
	
}

//��Ƹ���Vehicle
class Vehicle
{
	private String m_registerCode;
	private String m_maker;
	private int m_year;
	private double m_price = 0;
	
	//���췽��
	public Vehicle(String registerCode,String maker,int year) {
		this.m_registerCode = registerCode;
		this.m_maker = maker;
		this.m_year = year;
	}

	public double getM_price() {
		if(this.m_price ==0)
		{
			System.out.println("δ���ü۸�");
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
	//��дtostring
	public String toString()
	{
		return "ע�����ǣ�"+this.m_registerCode+","+"���������̣�"+this.m_maker+","+"������ݣ�"+this.m_year+","+
					"�۸��ǣ�"+this.m_price+"Ԫ��"; 
	}
	
	public int calu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������������(�ö��ŷָ�)��");
		String []arr = sc.nextLine().split(",");
		int in_year =Integer.parseInt(arr[0]) ;
		int in_month = Integer.parseInt(arr[1]);
		int in_day = Integer.parseInt(arr[2]);
		//System.out.printf("%d,%d,%d\n",in_year,in_month,in_day);
		//����һ����������,Ĭ�ϳ������ɵ���һ��һ������
		int day[] = {0,31,59,90,120,151,181,212,243,273,304,334};
		if(in_year < this.m_year)
		{
			System.out.println("��������");
			return 0;
		}
		else {
			int res = (in_year-this.m_year)*365 + day[in_month] + in_day;
			return res;
		}
		
		
	}
	
	
	
}