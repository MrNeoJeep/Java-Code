package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_3 {

	public static void main(String[] args) {
		//编写程序，分写获得一个数的整数和小数部分
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个小数:");
		float num = sc.nextFloat();
		sc.close();
		if(num > 0)
		{
		//方法一直接强转，会出现小数部分不准的问题，估计是二进制转换时存在的问题
	//		int num_int = (int)num;
	//		float num_float = num - num_int;
	//		System.out.println(num+"的整数部分为："+num_int);
	//		System.out.println(num+"的小数部分为：" + num_float);
			//System.out.printf("%.2f",num_float);
			//方法二：字符串的分割
//			String str = String.valueOf(num);
//			String[] array = str.split("\\.");
//			System.out.println(num +"的整数部分：" + array[0]);
//			System.out.println(num + "的小数部分：0." + array[1]);
			//方法三：索引
			String str = String.valueOf(num);
			int pointIndex = str.indexOf('.');
			System.out.println(num +"的整数部分：" + str.substring(0,pointIndex));
		    System.out.println(num + "的小数部分：0" + str.substring(pointIndex,str.length()));
		}
		else if(num < 0)
		{
			num = - num;
			String str = String.valueOf(num);
			String[] array = str.split("\\.");
			System.out.println(num +"的整数部分：-" + array[0]);
			System.out.println(num + "的小数部分：-0." + array[1]);
		}
		else
		{
			System.out.println("输入有误");
		}

	}

}
