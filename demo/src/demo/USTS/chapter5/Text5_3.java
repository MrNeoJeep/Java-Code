package demo.USTS.chapter5;
public class Text5_3 {

	public static void main(String[] args) {
		/*编写一个studentList类用来存储练习（1）中描述的student对象。
		 * 下面的UML图描述了StudentList对象和student对象的关系。
		 * */
		StudentList list1 = new StudentList(4);
		student stu1  = new student("①", "Tom",30,20,30);
		student stu2  = new student("②", "Kitti",89,88,49);
		student stu3  = new student("③", "Lili",89,76,77);
		list1.add(stu1);
		list1.add(stu2);
		list1.add(stu3);
		System.out.println("总数为："+list1.getTotal()); 
		list1.getItem("①");
		list1.getItem("②");
		list1.getItem("③");
		

	}

}
//学生列表
class StudentList 
{
	student[] list;
	int total = 0;
	
	StudentList(int length)
	{
		list = new student[length];//长度
	}
	
	//判断数组是否为空
	public boolean isEmpty()
	{
		if(total == 0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	//判断数组是否满
	public boolean isFull()
	{
		if(total == list.length-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	//添加函数
	public boolean add(student stu)
	{
		if(isFull())
		{
			return false;
		}
		else {
			list[total] = new student(stu.studentNumber, stu.studentName,stu.markForMaths,stu.markForEnglish,stu.markForScience);
			total++;
			return true;
		}
		
	}
	//移除函数
	public boolean remove(String number)
	{
		if(isEmpty())
		{
			return false;
		}
		else {
			for(int i = 0; i < total;i++)
			{
				if(list[i].studentNumber == number)
				{
					for(int j = i; j < total-1;j++)
					{
						list[j] = list[j+1];
					}
				}
				total--;
				
			}
			return true;
		}
	}
	student [] arr = new student[5];
	public void getItem(String number)
	{
		if(!isEmpty())
		{
			for(int i = 0;i <= total;i++)
			{
				if(list[i].studentNumber == number)
				{
					
					System.out.println(list[i].studentNumber);
					System.out.println(list[i].studentName);
					System.out.println("英语成绩："+list[i].markForEnglish);
					System.out.println("数学成绩："+list[i].markForMaths);
					System.out.println("科学成绩："+list[i].markForScience);
					return;
				}
			}
			
		}
		else {
			System.out.println("空");
		}
		
		
	}
	public int  getTotal() {
		return total;
		
	}
	 
}

class student
{
	 String studentNumber;
	 String studentName;
	 int markForMaths = -1;
	 int markForEnglish = -1;
	 int markForScience = -1;
	//构造方法
	public student(String studentNumber,String studentName,int markForMaths,int markForEnglish,int markForScience) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.markForEnglish = markForEnglish;
		this.markForMaths = markForMaths;
		this.markForScience = markForScience;
	}
	public String getNumber() {
		return studentNumber;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getMarkForMaths() {
		return markForMaths;
	}
	
	public int getMarkForEnglish() {
		return markForEnglish;
	}
	
	public int getMarkForScience() {
		return markForScience;
	}
	public double calculateAverageMark()
	{
		return (double)(this.markForEnglish+this.markForMaths+this.markForScience)/3;
	}
}
