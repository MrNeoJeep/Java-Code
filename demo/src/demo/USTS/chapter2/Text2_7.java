package demo.USTS.chapter2;
import java.util.Scanner;
public class Text2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个坐标，用逗号分隔：");
		String num = sc.next();
		String []arr = num.split(",");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		if(x == 0 && y == 0)
		{
			System.out.println("此点位于原点");
		}
		else if(x == 0)
		{
			System.out.println("此点位于y轴");
		}
		else if(y == 0)
		{
			System.out.println("此点位于x轴");
		}
		else if(x > 0 && y > 0)
		{
			System.out.println("此点位于第一象限");
		}
		else if(x > 0 && y < 0)
		{
			System.out.println("此点位于第四象限");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("此点位于第二象限");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("此点位于第三象限");
		}
	}

}
