package demo.USTS.chapter4;

import java.util.Scanner;

public class Text4_3 {

	public static void main(String[] args) {
		// 编写一个程序，使用户输入选举中的五位竞选人的姓名，每位竞选人的得票数，程序输出
		//每位竞选人的姓名，得票数和得票数占占总投票数的百分比，还要输出本次比赛的第一名
		Scanner sc = new Scanner(System.in);
		//定义两个数组存放姓名和得票数
		String name[] = new String [5];
		int vote[] = new int[5];
		for(int i = 0; i < 5;i++)
		{
			System.out.println("请输入第"+(i+1)+"竞选人的姓名与票数，用逗号分隔：");
			String temp = sc.next();
			String arr[] = temp.split("\\,");
			name[i] = arr[0];
			int num = Integer.parseInt(arr[1]);
			if(num < 0)
			{
				System.out.println("输入有误");
				return;
			}
			vote[i] = num;
		}
		
		int sum = 0;
		for(int i = 0; i < vote.length;i++)
		{
			sum += vote[i];
		}
		//输出
		for(int i = 0;i < 5;i++)
		{
			System.out.printf("第%d位竞选者姓名为：%s ,得票数：%d ,得票数占总投票数的百分比：%.2f%%\n" ,i+1, name[i] , vote[i]
					, ((double)vote[i]/sum)*100);
		}
	}

}
