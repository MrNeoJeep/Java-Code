package demo.USTS.chapter7;


public class Text7_3 {

	public static void main(String[] args) {
		/* ����UMLͼ��д4���ࣺ
		 * 1��phone�����࣬���г��󷽷���绰
		 * 2��Ebook�ӿڣ����г��󷽷�read������
		 * 3��PadPhone�̳���Phone�����ಢʵ����Ebook�ӿ�
		 * call���������**Ʒ�Ƶ��ֻ��ڴ�绰
		 * read���������**Ʒ�Ƶĵ��������Ķ�
		 * 4��������Test����main�����������д���Ʒ��Ϊhuawei�Ķ��󣬵���call������read����
		 * */
		testPadPhone test = new testPadPhone();//�ڶ����������ݣ���jvm�����ʵ�ֻ�����Դ
		test.main(args);		
	}

}
//��д������
class testPadPhone
{
	public void main(String [] args)
	{
		PadPhone p1 = new PadPhone("HuaWei");
		p1.Call();
		p1.read();
	}
	
	
}
//��дpadPhone��
class PadPhone extends Phone implements Ebook
{
	private String m_brand;
	public PadPhone(String brand) {
		this.m_brand = brand;
	}
	
	public void Call()
	{
		System.out.println(this.m_brand+"Ʒ�Ƶ��ֻ��ڴ�绰��");
	}
	public void read()
	{
		System.out.println(this.m_brand+"Ʒ�Ƶĵ��������Ķ���");
	}
}
//��дEbook�Ľӿ�
interface Ebook
{
	abstract void read();
}

//��дphone�ĳ�����
abstract class Phone
{
	abstract void Call();
}

