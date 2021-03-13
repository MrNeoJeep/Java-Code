package demo.USTS.chapter2;

public class Text2_5 {

	public static void main(String[] args) {
		//甲乙两个人打赌，看谁赚的钱多。甲承诺每天每天给乙1000块钱，乙承诺第一题给甲1分钱，第二题两分钱
		//第三天4分钱……，30天后谁赢
		//num1为甲赚的钱，num2为乙赚的钱
		int num1;
		int num2;
		num2 = 1000*30;
		num1 = 1;
		int temp = 0;
		for(int i = 0 ;i < 30; i++)
		{
			temp += num1;
			num1 *= 2;
		}
		double temp1 = (double)temp;
		double num1_res = temp1 / 100;//换算成元
		boolean flag = true;
		flag = num1_res > num2?true:false;
		//测试
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(temp1);
		
		if(num1_res == num2)
		{
			System.out.println("两者一样");
			return;
		}
		if(flag)
		{
			System.out.println("甲赢了");
		}
		else
		{
			System.out.println("乙赢了");
		}

	}

}
