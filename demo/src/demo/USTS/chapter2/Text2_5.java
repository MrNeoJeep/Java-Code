package demo.USTS.chapter2;

public class Text2_5 {

	public static void main(String[] args) {
		//���������˴�ģ���˭׬��Ǯ�ࡣ�׳�ŵÿ��ÿ�����1000��Ǯ���ҳ�ŵ��һ�����1��Ǯ���ڶ�������Ǯ
		//������4��Ǯ������30���˭Ӯ
		//num1Ϊ��׬��Ǯ��num2Ϊ��׬��Ǯ
		int num1;
		int num2;
		num2 = 1000*30;
		num1 = 1;
		int temp = 0;
		for(int i = 0 ;i < 30; i++)
		{
			temp += num1;
			num1 *= 2;
		}
		double temp1 = (double)temp;
		double num1_res = temp1 / 100;//�����Ԫ
		boolean flag = true;
		flag = num1_res > num2?true:false;
		//����
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(temp1);
		
		if(num1_res == num2)
		{
			System.out.println("����һ��");
			return;
		}
		if(flag)
		{
			System.out.println("��Ӯ��");
		}
		else
		{
			System.out.println("��Ӯ��");
		}

	}

}
