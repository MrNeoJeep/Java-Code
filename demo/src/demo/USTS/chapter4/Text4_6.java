package demo.USTS.chapter4;

import java.util.Scanner;

public class Text4_6 {

	public static void main(String[] args) {
		/*编写一个程序，使用二维数组存储一年中每个月的最高气温和最低气温。该程序输出一年中的最高
		气温的平均值，最低气温的平均值，最高气温，最低气温。该程序必须由以下方法组成：
		1、getData（）方法：读取数据并将数据存储到二维数组中
		2、averageHeight（）方法：计算并返回一年中最高气温的平均值
		3、averageLow（）方法：计算并返回一年中最低气温的平均值
		4、indexHighTemp（）方法：返回数组中最高气温的索引
		5、indexLowTemp（）方法：返回数组中最低气温的索引
		*/
		
		double [][]temperature = new double[12][2];
		temperature = getData(temperature);
		double averageHeight = averageHeight(temperature);
		double averageLow = averageLow(temperature);
		int maxIndex = indexHighTemp(temperature);
		int minIndex = indexLowTemp(temperature);
		System.out.printf("一年中最高气温的平均值:%.2f\n",averageHeight );
		System.out.printf("一年中最低气温的平均值:%.2f\n" ,averageLow );
		System.out.println("最高气温的索引:" + maxIndex );
		System.out.println("最低气温的索引:" + minIndex );
	}
	//1、获取数据
	public static double[][] getData(double temperature[][])
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 12;i++)
		{
			System.out.println("请分别输入"+(i+1)+"月的最高气温，最低气温（用空格分隔）");
			String s = sc.nextLine();
			String arr[] = s.split(" ");
			double maxTem = Double.parseDouble(arr[0]);
			double minTem = Double.parseDouble(arr[1]);
			temperature[i][0] = maxTem;
			temperature[i][1] = minTem;
		}
		sc.close();
		return temperature;
	}
	//2、计算并返回一年中最高气温的平均值
	public static double averageHeight(double temperature[][])
	{
		double maxTemAll = 0;
		for(int i = 0;i < 12;i++)
		{
			maxTemAll += temperature[i][0];
		}
		return (double)maxTemAll/12;
	}
	//2、计算并返回一年中最低气温的平均值
	public static double averageLow(double temperature[][])
	{
		double minTemAll = 0;
		for(int i = 0;i < 12;i++)
		{
			minTemAll += temperature[i][1];
		}
		return (double)minTemAll/12;
	}
	//3、返回数组中最高气温的索引
	public static int indexHighTemp(double temperature[][])
	{
		int max = 0;
		for(int i = 0;i < 12;i++)
		{
			if(temperature[max][0] < temperature[i][0])
			{
				max = i;
			}
		}
		return max;
	}
	//4、返回数组中最低气温的索引
	public static int indexLowTemp(double temperature[][])
	{
		int min = 0;
		for(int i = 0;i < 12;i++)
		{
			if(temperature[min][1] > temperature[i][1])
			{
				min = i;
			}
		}
		return min;
	}
	

}
