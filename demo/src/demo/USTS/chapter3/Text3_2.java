package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_2 {

	public static void main(String[] args) {
		//编写方法reverseDigit，将一个整数作为参数，并反向返回该数字。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = scanner.nextInt();
		int resu = reverseDigit(num);
		System.out.println("反转之后的数为："+ resu);
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
