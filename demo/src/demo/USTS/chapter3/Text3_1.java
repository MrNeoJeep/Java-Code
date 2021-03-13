package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_1 {

	public static void main(String[] args) {
		//产生错误：java.util.NoSuchElementException
//		at java.base/java.util.Scanner.throwFor(Scanner.java:937)
//		at java.base/java.util.Scanner.next(Scanner.java:1594)
//		at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//		at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//		at demo/demo.USTS.chapter3.Text3_1.main(Text3_1.java:21)
//		查阅资料得知：这个错误出现在定义Scanner的时候，如果在两个函数中同时定义 Scanner 并且都写了 close() 函数，
//		在运行过程中如果有一个 close() 函数被执行，再次使用 Scanner 时将会产生该错误。
//		原因可能是由于使用close()函数时会关闭所有的Scanner关闭（待查看文档）。
//		所以只用在全部执行结束后再使用 close() 函数去关闭Scanner。

		//摄氏温度与华氏温度的转换
		System.out.println("-----------菜单---------");
		System.out.println("--1、摄氏温度转换为华氏温度--");
		System.out.println("--2、华氏温度转换为摄氏温度--");
		System.out.println("--3、退出             --");
		System.out.println("-----------菜单---------");
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int key = 0 ;
		while(flag)
		{
			System.out.println("请输入你的选择");
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
//				System.out.println("欢迎下次使用！~~~");
//				sc.close();
//				break;
//			}
//			else
//			{
//				System.out.println("输入错误，请重新输入");
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
				System.out.println("欢迎下次使用！~~~");
				sc.close();
				break;
			default:
				break;
			}
		}
		
	}
	//1、实现1号菜单的任务
	public static void C_to_F()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入摄氏温度：");
		String num = scanner.next();
		float C = Float.parseFloat(num);
		if(C < -273.15)
		{
			System.out.println("输入错误");
			scanner.close();
			return;
		}
		float F ;
		F = C * ((float)9/5) + (float)32;
		System.out.printf("%.2f摄氏度对应的华氏度为：%.2f\n",C,F);
		//scanner.close();
	}
	//2、实现2号菜单的任务
	public static void F_to_C()
	{
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("请输入一个华氏温度：");
		String num  = scanner2.next();
		float F = Float.parseFloat(num);
		if(F < -459.67)
		{
			System.out.println("输入有误");
			scanner2.close();
			return;
		}
		float C;
		C = (F - 32)*((float)5/9);
		System.out.printf("%.2f华氏度对应的摄氏度为：%.2f\n",F,C);
		//scanner2.close();
	}

}
