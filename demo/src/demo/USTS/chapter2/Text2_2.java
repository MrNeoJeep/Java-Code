package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_2 {

	public static void main(String[] args) {
		//编写程序。提示用户输入一个4位正整数，该程序以每行一个数字输出该数。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个四位数");
		int num = sc.nextInt();
		sc.close();
//		System.out.println(num/1000);
//		num %= 1000;
//		System.out.println(num/100);
//		num %= 100;
//		System.out.println(num/10);
//		num %= 10;
//		System.out.println(num/1);
		int i = 1000;
		while(i >= 1)
		{
			System.out.println(num/i);
			num %=i;
			i /=10 ;
		}
	}

}
