package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_4{
public static void main(String[] args) {
		//��д����distance,����ѿ���ƽ�������㣨x1,y1��,(x2,y2)��ľ��롣
		//�˷�������ʾƽ����������4������Ϊ���Ĳ����������������ľ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����꣨��ʹ��Ӣ�Ķ��ŷָ���:");
		String first = sc.next();
		System.out.println("������ڶ������꣨��ʹ��Ӣ�Ķ��ŷָ���:");
		String second = sc.next();
		String [] arr1 = first.split("\\,");
		String [] arr2 = second.split("\\,");
		double x1 = Double.parseDouble(arr1[0]);
		double y1 = Double.parseDouble(arr1[1]);
		double x2 = Double.parseDouble(arr2[0]);
		double y2 = Double.parseDouble(arr2[1]);
		double d = distace(x1, y1, x2, y2);
		System.out.println("�����ľ���Ϊ��" + d);
		sc.close();
	}
	public static double distace(double x1,double y1,double x2,double y2) 
	{
		
		double d;
		double temp = (x1 - x2)*(x1 - x2)+(y1 - y2)*(y1 -y2);
		d = Math.sqrt(temp);
		return d;
	}

}
