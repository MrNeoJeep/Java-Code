package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_2 {

	public static void main(String[] args) {
		//��д����reverseDigit����һ��������Ϊ�����������򷵻ظ����֡�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = scanner.nextInt();
		int resu = reverseDigit(num);
		System.out.println("��ת֮�����Ϊ��"+ resu);
		scanner.close();
	}
	public static int reverseDigit(int num)
	{
		int res = 0;
		if(num == 0)
		{
			return 0;
		}
		
		while(num != 0)
		{
			int pop = num % 10;
			num /= 10;
			res = res * 10 + pop;
			
		}
		return res;
	}

}
