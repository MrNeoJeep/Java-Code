package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ֱ��������������Զ��ŷָ�");
		String num = sc.next();
		String []arr = num.split("\\,");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		System.out.println("��²�������֮�ͣ�");
		int num3 = sc.nextInt();
		if(num3 == num1 + num2)
		{
			System.out.println("��ϲ�㣬�¶���");
		}
		else
		{
			System.out.println("����ģ���ȷ���ǣ�" + (num1 + num2));
		}
		sc.close();
	}

}
