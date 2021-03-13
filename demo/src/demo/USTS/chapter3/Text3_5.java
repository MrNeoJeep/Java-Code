package demo.USTS.chapter3;

public class Text3_5 {

	public static void main(String[] args) {
		//编写程序，随机产生100个0~9的数，统计0~9每个数出现的概率
		double[] arr = times();
		for(int i = 0;i < 10;i++)
		{
			System.out.println("数字" + i + "的概率为：" + arr[i]);
		}
	}
	public static double[] times()
	{
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		for(int i = 0;i < 100 ;++i)
		{
			int num = (int)(Math.random() *10);
			switch (num) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			case 7:
				count7++;
				break;
			case 8:
				count8++;
				break;
			case 9:
				count9++;
				break;
			default:
				break;
			}
		}
		
		double [] arr = new double[10];
		arr[0] = (double)count0/100;
		arr[1] = (double)count1/100;
		arr[2] = (double)count2/100;
		arr[3] = (double)count3/100;
		arr[4] = (double)count4/100;
		arr[5] = (double)count5/100;
		arr[6] = (double)count6/100;
		arr[7] = (double)count7/100;
		arr[8] = (double)count8/100;
		arr[9] = (double)count9/100;
		return arr;
	}

}
