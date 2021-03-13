package demo.USTS.chapter3;

import java.util.Scanner;

public class Text3_4{
public static void main(String[] args) {
		//编写方法distance,计算笛卡尔平面中两点（x1,y1）,(x2,y2)间的距离。
		//此方法将表示平面上两个点4个数作为他的参数，并返回两点间的距离
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个坐标（请使用英文逗号分隔）:");
		String first = sc.next();
		System.out.println("请输入第二个坐标（请使用英文逗号分隔）:");
		String second = sc.next();
		String [] arr1 = first.split("\\,");
		String [] arr2 = second.split("\\,");
		double x1 = Double.parseDouble(arr1[0]);
		double y1 = Double.parseDouble(arr1[1]);
		double x2 = Double.parseDouble(arr2[0]);
		double y2 = Double.parseDouble(arr2[1]);
		double d = distace(x1, y1, x2, y2);
		System.out.println("两点间的距离为：" + d);
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
