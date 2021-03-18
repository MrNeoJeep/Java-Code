package demo.USTS.chapter4;

import java.util.Scanner;

public class Text4_6 {

	public static void main(String[] args) {
		/*��дһ������ʹ�ö�ά����洢һ����ÿ���µ�������º�������¡��ó������һ���е����
		���µ�ƽ��ֵ��������µ�ƽ��ֵ��������£�������¡��ó�����������·�����ɣ�
		1��getData������������ȡ���ݲ������ݴ洢����ά������
		2��averageHeight�������������㲢����һ����������µ�ƽ��ֵ
		3��averageLow�������������㲢����һ����������µ�ƽ��ֵ
		4��indexHighTemp��������������������������µ�����
		5��indexLowTemp��������������������������µ�����
		*/
		
		double [][]temperature = new double[12][2];
		temperature = getData(temperature);
		double averageHeight = averageHeight(temperature);
		double averageLow = averageLow(temperature);
		int maxIndex = indexHighTemp(temperature);
		int minIndex = indexLowTemp(temperature);
		System.out.printf("һ����������µ�ƽ��ֵ:%.2f\n",averageHeight );
		System.out.printf("һ����������µ�ƽ��ֵ:%.2f\n" ,averageLow );
		System.out.println("������µ�����:" + maxIndex );
		System.out.println("������µ�����:" + minIndex );
	}
	//1����ȡ����
	public static double[][] getData(double temperature[][])
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 12;i++)
		{
			System.out.println("��ֱ�����"+(i+1)+"�µ�������£�������£��ÿո�ָ���");
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
	//2�����㲢����һ����������µ�ƽ��ֵ
	public static double averageHeight(double temperature[][])
	{
		double maxTemAll = 0;
		for(int i = 0;i < 12;i++)
		{
			maxTemAll += temperature[i][0];
		}
		return (double)maxTemAll/12;
	}
	//2�����㲢����һ����������µ�ƽ��ֵ
	public static double averageLow(double temperature[][])
	{
		double minTemAll = 0;
		for(int i = 0;i < 12;i++)
		{
			minTemAll += temperature[i][1];
		}
		return (double)minTemAll/12;
	}
	//3������������������µ�����
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
	//4������������������µ�����
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
