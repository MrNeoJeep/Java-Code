package demo.USTS.chapter4;

import java.util.Scanner;

public class Text4_3 {

	public static void main(String[] args) {
		// ��дһ������ʹ�û�����ѡ���е���λ��ѡ�˵�������ÿλ��ѡ�˵ĵ�Ʊ�����������
		//ÿλ��ѡ�˵���������Ʊ���͵�Ʊ��ռռ��ͶƱ���İٷֱȣ���Ҫ������α����ĵ�һ��
		Scanner sc = new Scanner(System.in);
		//�������������������͵�Ʊ��
		String name[] = new String [5];
		int vote[] = new int[5];
		for(int i = 0; i < 5;i++)
		{
			System.out.println("�������"+(i+1)+"��ѡ�˵�������Ʊ�����ö��ŷָ���");
			String temp = sc.next();
			String arr[] = temp.split("\\,");
			name[i] = arr[0];
			int num = Integer.parseInt(arr[1]);
			if(num < 0)
			{
				System.out.println("��������");
				return;
			}
			vote[i] = num;
		}
		
		int sum = 0;
		for(int i = 0; i < vote.length;i++)
		{
			sum += vote[i];
		}
		//���
		for(int i = 0;i < 5;i++)
		{
			System.out.printf("��%dλ��ѡ������Ϊ��%s ,��Ʊ����%d ,��Ʊ��ռ��ͶƱ���İٷֱȣ�%.2f%%\n" ,i+1, name[i] , vote[i]
					, ((double)vote[i]/sum)*100);
		}
	}

}
