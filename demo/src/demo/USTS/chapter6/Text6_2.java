package demo.USTS.chapter6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Text6_2 {

	public static void main(String[] args) {
		/*ʹ�����ڹ����࣬��д��ȡϵͳ���ں�ʱ��Ĺ��ܷ�����
		 * ��ȡϵͳ���ڵķ���Ҫ������
		 * 1����������getSystemDate
		 * 2�����������ʽ��yyyy-MM-dd
		 * 3��ʹ��SimpleDataFormat��ʽ����ǰϵͳʱ�䡣
		 * ��ȡϵͳʱ��ķ���Ҫ��
		 * 1��������getSystemTime
		 * 2��ʱ�������ʽ��HH:mm:ss��24Сʱ�ƣ�
		 * 3��ʹ��simpleDataFormat��ʽ����ǰϵͳʱ��
		 * 
		 * */
		getSystemDate get1 = new getSystemDate();
		getSystemTime get2 = new getSystemTime();
		get1.getdate();
		get2.gettime();
	}

}

//��ȡ����
class getSystemDate
{
	public void getdate()
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		System.out.println(formatter.format(calendar.getTime()));  
	}
}

class getSystemTime
{
	public void gettime()
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		System.out.println(formatter.format(calendar.getTime()));  
	}
}
