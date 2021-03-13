package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_1 {

	public static void main(String[] args) {
		//编写程序，提示用户输入一个小数，然后输出与该数最接近的整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小数");
		float num = sc.nextFloat();
		int num_int = (int)num;
		float temp = num - num_int;
		sc.close();
		if(temp == 0.5)
		{
			System.out.println(num_int);
			System.out.println(num_int+1);
		}
		else if(temp < 0.5)
		{
			System.out.println(num_int);
		}
		else
		{
			System.out.println(num_int+1);
		}
	}

}
