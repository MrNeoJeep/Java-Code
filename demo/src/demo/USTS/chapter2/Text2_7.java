package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����꣬�ö��ŷָ���");
		String num = sc.next();
		String []arr = num.split(",");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		if(x == 0 && y == 0)
		{
			System.out.println("�˵�λ��ԭ��");
		}
		else if(x == 0)
		{
			System.out.println("�˵�λ��y��");
		}
		else if(y == 0)
		{
			System.out.println("�˵�λ��x��");
		}
		else if(x > 0 && y > 0)
		{
			System.out.println("�˵�λ�ڵ�һ����");
		}
		else if(x > 0 && y < 0)
		{
			System.out.println("�˵�λ�ڵ�������");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("�˵�λ�ڵڶ�����");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("�˵�λ�ڵ�������");
		}
	}

}
