package demo.USTS.chapter4;

import java.util.Scanner;

public class Text4_2 {

	public static void main(String[] args) {
		// ����ٻ���ˮ�����У�ÿ��ѡ�ֵĵ÷ֵļ��㷽��ʹȥ��һ����߷ֺ�һ����ͷ֣�Ȼ����������÷�
		//��дһ������ʹ�û�������8�����е����֣�Ȼ�����ѡ�ֵĵ÷֡�������1~10�ڴ�֡�
		
		//����
		Scanner sc = new Scanner(System.in);
		double [] arr = new double[8];
		for(int i = 0; i < 8;i++)
		{
			
			System.out.printf("���%dλ��������(��������Ϊ1~10)��\n",i+1);
			double temp = sc.nextDouble();
			if(temp > 10 || temp < 1)
			{
				System.out.println("��������");
				return;
			}
			else {
				arr[i] = temp;
			}
			
		}
		
		//�ҵ����ֵ����Сֵ��ɾ��
		//��������С
		double maxNum = arr[0];
		double minNum = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > maxNum)
			{
				maxNum = arr[i];
			}
			if(arr[i] < minNum)
			{
				minNum = arr[i];
			}
		}
		//ɾ�������е�Ԫ��  ����һ���µ�����
		double res[] = new double[6];
		int size = 0;
		for(int i = 0; i < 8 ; i++)
		{
			if(arr[i] != maxNum && arr[i] != minNum)
			{
				res[size] = arr[i];
				size++;
			}
		}
		//���
		double sum  = 0;
		for(int i = 0 ; i <res.length;i++ )
		{
			sum += res[i];
			//System.out.println(res[i]);
		}
		System.out.printf("ѡ�ֵ��ܵ÷�Ϊ��%.2f\n", sum);
		sc.close();
	}

}
