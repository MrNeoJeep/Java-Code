package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_1 {

	public static void main(String[] args) {
		//��������java.util.NoSuchElementException
//		at java.base/java.util.Scanner.throwFor(Scanner.java:937)
//		at java.base/java.util.Scanner.next(Scanner.java:1594)
//		at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//		at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//		at demo/demo.USTS.chapter3.Text3_1.main(Text3_1.java:21)
//		�������ϵ�֪�������������ڶ���Scanner��ʱ�����������������ͬʱ���� Scanner ���Ҷ�д�� close() ������
//		�����й����������һ�� close() ������ִ�У��ٴ�ʹ�� Scanner ʱ��������ô���
//		ԭ�����������ʹ��close()����ʱ��ر����е�Scanner�رգ����鿴�ĵ�����
//		����ֻ����ȫ��ִ�н�������ʹ�� close() ����ȥ�ر�Scanner��

		//�����¶��뻪���¶ȵ�ת��
		System.out.println("-----------�˵�---------");
		System.out.println("--1�������¶�ת��Ϊ�����¶�--");
		System.out.println("--2�������¶�ת��Ϊ�����¶�--");
		System.out.println("--3���˳�             --");
		System.out.println("-----------�˵�---------");
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int key = 0 ;
		while(flag)
		{
			System.out.println("���������ѡ��");
			key = sc.nextInt();
//			if(key == 1)
//			{
//				C_to_F();
//			}
//			else if(key == 2)
//			{
//				F_to_C();
//			}
//			else if(key == 3)
//			{
//				flag = false;
//				System.out.println("��ӭ�´�ʹ�ã�~~~");
//				sc.close();
//				break;
//			}
//			else
//			{
//				System.out.println("�����������������");
//			}
			switch (key) 
			{
			case 1:
				C_to_F();
				break;
			case 2:
				F_to_C();
				break;
			case 3:
				flag = false;
				System.out.println("��ӭ�´�ʹ�ã�~~~");
				sc.close();
				break;
			default:
				break;
			}
		}
		
	}
	//1��ʵ��1�Ų˵�������
	public static void C_to_F()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������¶ȣ�");
		String num = scanner.next();
		float C = Float.parseFloat(num);
		if(C < -273.15)
		{
			System.out.println("�������");
			scanner.close();
			return;
		}
		float F ;
		F = C * ((float)9/5) + (float)32;
		System.out.printf("%.2f���϶ȶ�Ӧ�Ļ��϶�Ϊ��%.2f\n",C,F);
		//scanner.close();
	}
	//2��ʵ��2�Ų˵�������
	public static void F_to_C()
	{
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("������һ�������¶ȣ�");
		String num  = scanner2.next();
		float F = Float.parseFloat(num);
		if(F < -459.67)
		{
			System.out.println("��������");
			scanner2.close();
			return;
		}
		float C;
		C = (F - 32)*((float)5/9);
		System.out.printf("%.2f���϶ȶ�Ӧ�����϶�Ϊ��%.2f\n",F,C);
		//scanner2.close();
	}

}
