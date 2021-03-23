package demo.USTS.chapter6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Text6_2 {

	public static void main(String[] args) {
		/*使用日期工具类，编写获取系统日期和时间的功能方法。
		 * 获取系统日期的方法要求如下
		 * 1、方法名：getSystemDate
		 * 2、日期输出格式：yyyy-MM-dd
		 * 3、使用SimpleDataFormat格式化当前系统时间。
		 * 获取系统时间的方法要求
		 * 1、方法名getSystemTime
		 * 2、时间输出格式：HH:mm:ss（24小时制）
		 * 3、使用simpleDataFormat格式化当前系统时间
		 * 
		 * */
		getSystemDate get1 = new getSystemDate();
		getSystemTime get2 = new getSystemTime();
		get1.getdate();
		get2.gettime();
	}

}

//获取日期
class getSystemDate
{
	public void getdate()
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		System.out.println(formatter.format(calendar.getTime()));  
	}
}

class getSystemTime
{
	public void gettime()
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		System.out.println(formatter.format(calendar.getTime()));  
	}
}
