package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_1 {

	public static void main(String[] args) {
		//��д������ʾ�û�����һ��С����Ȼ������������ӽ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��С��");
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
