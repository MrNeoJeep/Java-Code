package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_3 {
	public static void main(String[] args)
	{
		//��ĿҪ�󣺱�д����һ�����Ĺ������£�1��1��2��3��5��8��13��21��34�������������ĵ���ʮλ�Ƕ��١�
		//쳲���������
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		int n = scanner.nextInt();
		System.out.println("��" + n + "��Ϊ��" + fibo(n));
		scanner.close();
	}
	//ʹ�õݹ���ʵ��
	static int fibo(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else 
		{
			return fibo(n-1) + fibo(n -2);
		}
	}
}
