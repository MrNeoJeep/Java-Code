package demo.USTS.chapter4;

import java.util.Scanner;

public class Text4_2 {

	public static void main(String[] args) {
		// 在体操或跳水比赛中，每个选手的得分的计算方法使去掉一个最高分和一个最低分，然后加上其他得分
		//编写一个程序，使用户能输入8个裁判的评分，然后输出选手的得分。裁判在1~10内打分。
		
		//输入
		Scanner sc = new Scanner(System.in);
		double [] arr = new double[8];
		for(int i = 0; i < 8;i++)
		{
			
			System.out.printf("请第%d位裁判评分(评分区间为1~10)：\n",i+1);
			double temp = sc.nextDouble();
			if(temp > 10 || temp < 1)
			{
				System.out.println("输入有误");
				return;
			}
			else {
				arr[i] = temp;
			}
			
		}
		
		//找到最大值和最小值并删除
		//找最大和最小
		double maxNum = arr[0];
		double minNum = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > maxNum)
			{
				maxNum = arr[i];
			}
			if(arr[i] < minNum)
			{
				minNum = arr[i];
			}
		}
		//删除数组中的元素  创建一个新的数组
		double res[] = new double[6];
		int size = 0;
		for(int i = 0; i < 8 ; i++)
		{
			if(arr[i] != maxNum && arr[i] != minNum)
			{
				res[size] = arr[i];
				size++;
			}
		}
		//求和
		double sum  = 0;
		for(int i = 0 ; i <res.length;i++ )
		{
			sum += res[i];
			//System.out.println(res[i]);
		}
		System.out.printf("选手的总得分为：%.2f\n", sum);
		sc.close();
	}

}
