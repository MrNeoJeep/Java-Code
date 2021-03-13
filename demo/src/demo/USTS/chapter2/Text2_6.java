package demo.USTS.chapter2;

import java.util.Scanner;

public class Text2_6 {

	public static void main(String[] args) {
		//自动售货机
		System.out.println("[1] 口香糖");
		System.out.println("[2] 巧克力");
		System.out.println("[3] 爆米花");
		System.out.println("[4] 果汁");
		System.out.println("[5] 显示购买总数");
		System.out.println("[6] 退出");
		System.out.println("自助售卖机欢迎你！！！");
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		boolean flag = true;
		while(flag)
		{
			System.out.println("请选择编号购买商品：");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("您购买了口香糖");
				num1++;
				break;
			case 2:
				System.out.println("您购买了巧克力");
				num2++;
				break;
			case 3:
				System.out.println("您购买了爆米花");
				num3++;
				break;
			case 4:
				System.out.println("您购买了果汁");
				num4++;
				break;
			case 5:  //显示购物清单
				if(num1 != 0)
				{
					System.out.println("您购买了" + num1 + "个口香糖");
				}
				if(num2 != 0)
				{
					System.out.println("您购买了" + num2 + "个巧克力");
				}
				if(num3 != 0)
				{
					System.out.println("您购买了" + num3 + "桶爆米花");
				}
				if(num4 != 0)
				{
					System.out.println("您购买了" + num4 + "杯果汁");
				}
				break;
			case 6:
				flag = false;
				System.out.println("欢迎下次使用！");
				sc.close();
				break;
			
			}
		}	
	}

}
