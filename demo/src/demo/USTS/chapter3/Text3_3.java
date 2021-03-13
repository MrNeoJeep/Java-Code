package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_3 {
	public static void main(String[] args)
	{
		//题目要求：编写程序，一列数的规律如下：1、1、2、3、5、8、13、21、34……求这列数的第三十位是多少。
		//斐波那契数列
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入项数：");
		int n = scanner.nextInt();
		System.out.println("第" + n + "项为：" + fibo(n));
		scanner.close();
	}
	//使用递归来实现
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
