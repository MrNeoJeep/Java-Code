package demo.USTS.chapter4;

import java.util.Scanner;


public class Text4_5 {

	public static void main(String[] args) {
		/*�ɻ�������λ����дһ���������ڷ���һ������ɻ�����λ���÷ɻ���13����λ
		 * ÿ��������λ����һ�ţ��ڶ�����ͷ�Ȳգ������Ǿ��òա����������ʾ�û�����������Ϣ
		 * ��Ʊ���ͣ�ͷ��/���ã�
		 * *�����ѡ��#�����ѷ��䡣�����򿪷�Ϊ�˵���������ʾ�û���ѡ��
		*/
		String [][]seat = new String [13][6];
		for(int i = 0; i < 13;i++)
		{
			for(int j = 0; j < 6;j++)
			{
				seat[i][j] = "*";
			}
		}
		boolean  flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1,��ʾʣ����λ");
		System.out.println("2,ѡ���Ʊ����");
		System.out.println("3,�˳�");
		while(flag)
		{
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				show(seat);
				break;
			case 2:
				choice(seat);
				break;
			case 3:
				flag = false;
				scanner.close();
				System.out.println("��ӭ�´�ʹ�ã�");
				break;
			default:
				break;
			}
		}
	}
	//1����ʾ
	public static void show(String seat[][] )
	{
		for(int i = 0; i < 13;i++)
		{
			for(int j = 0; j < 6;j++)
			{
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
	}
	//2��ѡ��
	public static void choice(String seat[][])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1,ͷ�Ȳ�");
		System.out.println("2,���ò�");
		System.out.println("���������ѡ��");
		int num = scanner.nextInt();
		if(num == 1)
		{
			System.out.println("��ѡ��ǰ���ŵ�λ�ã�������������(���ŷָ�)��");
			String temp1 = scanner.next();
			String[] arr = temp1.split("\\,");
			int row = Integer.parseInt(arr[0]);//��
			int line = Integer.parseInt(arr[1]);//��
			if(row > 2)
			{
				System.out.println("�������");
				return;
			}
			seat[row][line] = "#";
		}
		else if(num == 2) 
		{
			System.out.println("��ѡ��3-13�ŵ�λ�ã���������������");
			String temp2 = scanner.next();
			String[] arr = temp2.split("\\,");
			int row = Integer.parseInt(arr[0]);//��
			int line = Integer.parseInt(arr[1]);//��
			if(row < 2)
			{
				System.out.println("�������");
				return;
			}
			seat[row][line] = "#";
		}
		System.out.println("���������ѡ��");
	}

}
