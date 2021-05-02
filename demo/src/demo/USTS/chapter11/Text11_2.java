package demo.USTS.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text11_2 {

	public static void main(String[] args) {
		/*以医院排队叫号就诊为业务背景，训练Java列表对象（List）的应用场景。患者取号排队
		 * ，等待叫号。叫号器负责叫号，叫号后移除排队的队首患者，并显示其他候诊人。
		 * 创建排队叫号器业务类（QueueCaller），私有属性有患者排队列表(ArrayList<String>queue);
		 * 方法有：
		 * ①、无参构造方法。构造方法内实例化患者排队列表（Queue）
		 * ②、获取患者数量的方法int size（）。该方法的功能是从排队队列queue中获取有效长度、
		 * ③、取号的方法void fetchNumber（String patientName）。本方法将就诊患者加入到排队的队列中
		 * 并输出患者的就诊信息，信息内容：
		 * 患者姓名+“前面还有”+排队人数+“位在等待就诊。”
		 * ④、显示候诊患者信息的方法 void showPatients（）。该方法获取排队的所有患者的姓名；
		 * 并输出每位患者的姓名，信息内容
		 * 患者姓名+“候诊中”
		 * ⑤、叫号方法void callNumber（）。该方法的功能是从排队队列中返回队首患者的姓名；
		 * 移除队首患者（表示患者已经就诊，不在排队队列中）；输出被叫号的患者的信息，信息内容
		 * “请患者：”+患者姓名+“到就诊室就诊！”
		 * 
		 * 创建主类（MainClass）模拟叫号情况。创建main方法，在方法内完成以下任务：创建一个排队叫号器的对象
		 * 向叫号器对象存入三个患者的姓名；循环叫号到没有患者为止；每次叫号均需显示正在排队的患者信息
		 * 
		 * 
		 */
		MainClass test = new MainClass();
		test.main();
	}

}

class MainClass extends QueueCaller
{
	public void main()
	{
		QueueCaller caller = new QueueCaller();
		caller.fetchNumber("张三");
		caller.fetchNumber("李四");
		caller.fetchNumber("王五");
		//不能用queue.size,因为size是在动态变化的。
		for(int i = 0; i < 3;i++)
		{
			caller.callNumber();
			caller.showPatients();
			System.out.println("~~~~~~~~~~~~~~");
		}
		
	}
}

//编写叫号器业务类QueueCaller
class QueueCaller
{
	protected List<String> queue;//排队的队列数组
	public QueueCaller()
	{
		queue = new ArrayList<String>();
	}
	//获取队列的长度
	public int getSize()
	{
		return queue.size();
	}
	//取号
	public void fetchNumber(String patientName)
	{
		int num = getSize();
		queue.add(patientName);
		System.out.println(patientName + "前面还有" + num + "位在等待就诊。");
	}
	//显示患者信息
	public void showPatients()
	{
		Iterator<String> it = queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"候诊中。");
		}
	}
	//叫号方法
	public void callNumber()
	{
		System.out.println("请患者：" + queue.get(0) + "到就诊室就诊。");
		queue.remove(0);
	}
	
}
