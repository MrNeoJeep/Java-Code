package demo.USTS.chapter5;

public class Text5_4 {

	public static void main(String[] args) {
		/*设计并实现一个Day类用于表示一周中的某一天。Day类可以表示出是星期几，
		 * 例如sun是表示星期天。对一个Day类型的对象
			程序可以实现以下操作
			1、设置星期几
			2、显示星期几
			3、返回星期几
			4、返回下一天
			5、返回前一天
			6、计算并返回当天之后的某一天是星期几。
			7、添加适当的构造方法
			8、定义一组方法实现在上面（1）~（7）中指定的对Day类的操作。
			9、编写一段程序来测试对Day类的各种操作。
		 * */
		Day day = new Day("星期四");
		day.show();
		String nextdayString = day.nextDay();
		String frontdayString = day.frontDay();
		System.out.println("星期四后一天： " + nextdayString);
		System.out.println("星期四前一天： " + frontdayString);
		String calString = day.calculate(13);
		System.out.println("13天后为： " + calString);
		

	}

}

//day类
class Day
{
	String []arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
	//表示星期几
	String week;
	int num;
	//构造方法，设置星期几
	Day(String week)
	{
		this.week = week;
		for(int i = 0 ;i < arr.length;i++)
		{
			if(arr[i] == this.week)
			{
				this.num = i;
			}
		}
	}
	
	//显示星期几
	public void show()
	{
		System.out.println("今天是"+this.week );
	}
	//返回星期几
	public String returnWeek()
	{
		return this.week;
	}
	//返回下一天
	public String nextDay()
	{
		if(this.num == 6)
		{
			return arr[0];
		}
		else {
			return arr[this.num+1];
		}
	}
	//返回前一天
	public String frontDay()
	{
		if(this.num == 0)
		{
			return arr[6];
		}
		else {
			return arr[this.num-1];
		}
	}
	//计算这一天后的之后某一天是星期几
	public String calculate(int in_num)
	{
		int temp = (this.num + in_num) % 7;
		return arr[temp];
	}
}
