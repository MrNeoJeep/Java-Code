package demo.USTS.chapter4;

import java.util.Scanner;


public class Text4_5 {

	public static void main(String[] args) {
		/*飞机分配座位。编写一个程序，用于分配一家商务飞机的座位。该飞机有13排座位
		 * 每排六个座位。第一排，第二排是头等舱，其余是经济舱。程序必须提示用户输入如下信息
		 * 机票类型（头等/经济）
		 * *代表可选，#代表已分配。将程序开发为菜单驱动，显示用户的选择。
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
		System.out.println("1,显示剩余座位");
		System.out.println("2,选择机票类型");
		System.out.println("3,退出");
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
				System.out.println("欢迎下次使用！");
				break;
			default:
				break;
			}
		}
	}
	//1、显示
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
	//2、选择
	public static void choice(String seat[][])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1,头等舱");
		System.out.println("2,经济舱");
		System.out.println("请输入你的选择：");
		int num = scanner.nextInt();
		if(num == 1)
		{
			System.out.println("请选择前两排的位置，并输入行列数(逗号分隔)：");
			String temp1 = scanner.next();
			String[] arr = temp1.split("\\,");
			int row = Integer.parseInt(arr[0]);//行
			int line = Integer.parseInt(arr[1]);//列
			if(row > 2)
			{
				System.out.println("输入错误");
				return;
			}
			seat[row][line] = "#";
		}
		else if(num == 2) 
		{
			System.out.println("请选择3-13排的位置，并输入行列数：");
			String temp2 = scanner.next();
			String[] arr = temp2.split("\\,");
			int row = Integer.parseInt(arr[0]);//行
			int line = Integer.parseInt(arr[1]);//列
			if(row < 2)
			{
				System.out.println("输入错误");
				return;
			}
			seat[row][line] = "#";
		}
		System.out.println("请输入你的选择：");
	}

}
