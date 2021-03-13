package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请分别输入两个数，以逗号分隔");
		String num = sc.next();
		String []arr = num.split("\\,");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		System.out.println("请猜测这两数之和：");
		int num3 = sc.nextInt();
		if(num3 == num1 + num2)
		{
			System.out.println("恭喜你，猜对了");
		}
		else
		{
			System.out.println("别灰心，正确答案是：" + (num1 + num2));
		}
		sc.close();
	}

}
