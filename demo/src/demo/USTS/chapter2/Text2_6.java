package demo.USTS.chapter2;

import java.util.Scanner;

public class Text2_6 {

	public static void main(String[] args) {
		//�Զ��ۻ���
		System.out.println("[1] ������");
		System.out.println("[2] �ɿ���");
		System.out.println("[3] ���׻�");
		System.out.println("[4] ��֭");
		System.out.println("[5] ��ʾ��������");
		System.out.println("[6] �˳�");
		System.out.println("������������ӭ�㣡����");
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		boolean flag = true;
		while(flag)
		{
			System.out.println("��ѡ���Ź�����Ʒ��");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("�������˿�����");
				num1++;
				break;
			case 2:
				System.out.println("���������ɿ���");
				num2++;
				break;
			case 3:
				System.out.println("�������˱��׻�");
				num3++;
				break;
			case 4:
				System.out.println("�������˹�֭");
				num4++;
				break;
			case 5:  //��ʾ�����嵥
				if(num1 != 0)
				{
					System.out.println("��������" + num1 + "��������");
				}
				if(num2 != 0)
				{
					System.out.println("��������" + num2 + "���ɿ���");
				}
				if(num3 != 0)
				{
					System.out.println("��������" + num3 + "Ͱ���׻�");
				}
				if(num4 != 0)
				{
					System.out.println("��������" + num4 + "����֭");
				}
				break;
			case 6:
				flag = false;
				System.out.println("��ӭ�´�ʹ�ã�");
				sc.close();
				break;
			
			}
		}	
	}

}
