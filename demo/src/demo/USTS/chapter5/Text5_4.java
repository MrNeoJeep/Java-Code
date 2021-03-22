package demo.USTS.chapter5;

public class Text5_4 {

	public static void main(String[] args) {
		/*��Ʋ�ʵ��һ��Day�����ڱ�ʾһ���е�ĳһ�졣Day����Ա�ʾ�������ڼ���
		 * ����sun�Ǳ�ʾ�����졣��һ��Day���͵Ķ���
			�������ʵ�����²���
			1���������ڼ�
			2����ʾ���ڼ�
			3���������ڼ�
			4��������һ��
			5������ǰһ��
			6�����㲢���ص���֮���ĳһ�������ڼ���
			7������ʵ��Ĺ��췽��
			8������һ�鷽��ʵ�������棨1��~��7����ָ���Ķ�Day��Ĳ�����
			9����дһ�γ��������Զ�Day��ĸ��ֲ�����
		 * */
		Day day = new Day("������");
		day.show();
		String nextdayString = day.nextDay();
		String frontdayString = day.frontDay();
		System.out.println("�����ĺ�һ�죺 " + nextdayString);
		System.out.println("������ǰһ�죺 " + frontdayString);
		String calString = day.calculate(13);
		System.out.println("13���Ϊ�� " + calString);
		

	}

}

//day��
class Day
{
	String []arr = {"����һ","���ڶ�","������","������","������","������","������"};
	//��ʾ���ڼ�
	String week;
	int num;
	//���췽�����������ڼ�
	Day(String week)
	{
		this.week = week;
		for(int i = 0 ;i < arr.length;i++)
		{
			if(arr[i] == this.week)
			{
				this.num = i;
			}
		}
	}
	
	//��ʾ���ڼ�
	public void show()
	{
		System.out.println("������"+this.week );
	}
	//�������ڼ�
	public String returnWeek()
	{
		return this.week;
	}
	//������һ��
	public String nextDay()
	{
		if(this.num == 6)
		{
			return arr[0];
		}
		else {
			return arr[this.num+1];
		}
	}
	//����ǰһ��
	public String frontDay()
	{
		if(this.num == 0)
		{
			return arr[6];
		}
		else {
			return arr[this.num-1];
		}
	}
	//������һ����֮��ĳһ�������ڼ�
	public String calculate(int in_num)
	{
		int temp = (this.num + in_num) % 7;
		return arr[temp];
	}
}
