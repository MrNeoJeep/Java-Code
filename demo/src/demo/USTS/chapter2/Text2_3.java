package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_3 {

	public static void main(String[] args) {
		//��д���򣬷�д���һ������������С������
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��С��:");
		float num = sc.nextFloat();
		sc.close();
		if(num > 0)
		{
		//����һֱ��ǿת�������С�����ֲ�׼�����⣬�����Ƕ�����ת��ʱ���ڵ�����
	//		int num_int = (int)num;
	//		float num_float = num - num_int;
	//		System.out.println(num+"����������Ϊ��"+num_int);
	//		System.out.println(num+"��С������Ϊ��" + num_float);
			//System.out.printf("%.2f",num_float);
			//���������ַ����ķָ�
//			String str = String.valueOf(num);
//			String[] array = str.split("\\.");
//			System.out.println(num +"���������֣�" + array[0]);
//			System.out.println(num + "��С�����֣�0." + array[1]);
			//������������
			String str = String.valueOf(num);
			int pointIndex = str.indexOf('.');
			System.out.println(num +"���������֣�" + str.substring(0,pointIndex));
		    System.out.println(num + "��С�����֣�0" + str.substring(pointIndex,str.length()));
		}
		else if(num < 0)
		{
			num = - num;
			String str = String.valueOf(num);
			String[] array = str.split("\\.");
			System.out.println(num +"���������֣�-" + array[0]);
			System.out.println(num + "��С�����֣�-0." + array[1]);
		}
		else
		{
			System.out.println("��������");
		}

	}

}
