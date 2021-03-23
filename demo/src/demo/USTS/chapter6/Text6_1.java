package demo.USTS.chapter6;

public class Text6_1 {

	public static void main(String[] args) {
		/* ���һ�������࣬�������˽����������ɫ��String�������ʣ�int����״̬��boolean��
		 * ��������в������췽�������Ʒ�����״̬��Ϊtrue�����صƷ�����false��
		 * ��Light�����oop.edu��
		 * Ȼ����Ʋ����ࡣ������յ�ƺ�����������Ϊ5W��10W,20W�ĵơ�������յ�ƺ���Ϩ���ɫ��
		 * */
		//����
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
//����������
class TestLight
{
	Light L1 = new Light("Red", 5, false);
	Light L2 = new Light("Green", 10, false);
	Light L3 = new Light("Blue", 20, false);
	public void turnOnLight1()
	{
		L1.setState(true);
		System.out.println("�Ѵ򿪺�ɫ��");
		
	}
	public void turnOnLight2()
	{
		L2.setState(true);
		System.out.println("�Ѵ���ɫ��");
	}
	public void turnOnLight3()
	{
		L3.setState(true);
		System.out.println("�Ѵ���ɫ��");
	}
	public void turnOffLight1()
	{
		L1.setState(false);
		System.out.println("�ѹرպ�ɫ��");
		
	}
	public void turnOffLight2()
	{
		L2.setState(false);
		System.out.println("�ѹر���ɫ��");
	}
	public void turnOffLight3()
	{
		L3.setState(false);
		System.out.println("�ѹر���ɫ��");
	}
}

//��������
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
