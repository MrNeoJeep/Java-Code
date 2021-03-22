package demo.USTS.chapter5;



public class Text5_1 {

	public static void main(String[] args) {
		/*下图描述了student类的设计，编写代码
		 * 编写一个用于测试student类的测试类，测试类中可以创建两个或三个学生（或学生数组更好）
		 * 并且使用student类测试他们是否按照声明执行操作
		 * */
		//测试
		testStudent test1 = new testStudent();
		test1.setMarks1(98, 97, 90);
		test1.setMarks2(95, 94, 92);
		test1.setMarks3(88, 97, 93);
		test1.settings();
		test1.testCal();
		

	}

}
//测试student类的设计
class testStudent
{
	Student1 s1  = new Student1("①", "Tom");
	Student1 s2  = new Student1("②", "Kitti");
	Student1 s3  = new Student1("③", "Lili");
	
	String Num[] = new String[3];
	String Name[] = new String[3];
	int mathsMark[] = new int[3];
	int EngMark[] = new int[3];
	int SciMark[] = new int[3];
	
	public void setMarks1(int mathsMark,int EngMark,int SciMark)
	{
		s1.enterMarks(mathsMark, EngMark, SciMark);
	}
	
	public void setMarks2(int mathsMark,int EngMark,int SciMark)
	{
		s2.enterMarks(mathsMark, EngMark, SciMark);
	}
	
	public void setMarks3(int mathsMark,int EngMark,int SciMark)
	{
		s3.enterMarks(mathsMark, EngMark, SciMark);
	}
	public void settings()
	{
		Num[0] = s1.getNumber();
		Num[1] = s2.getNumber();
		Num[2] = s3.getNumber();
		Name[0] = s1.getName();
		Name[1] = s2.getName();
		Name[2] = s3.getName();
		mathsMark[0] = s1.getMarkForMaths();
		mathsMark[1] = s2.getMarkForMaths();
		mathsMark[2] = s3.getMarkForMaths();
		EngMark[0] = s1.getMarkForEnglish();
		EngMark[1] = s2.getMarkForEnglish();
		EngMark[2] = s3.getMarkForEnglish();
		SciMark[0] = s1.getMarkForScience();
		SciMark[1] = s2.getMarkForScience();
		SciMark[2] = s3.getMarkForScience();
	}
	
	public void testCal()
	{
		System.out.printf("%s同学的平均成绩是：%.2f\n",s1.getName(),s1.calculateAverageMark());
		System.out.printf("%s同学的平均成绩是：%.2f\n",s2.getName(),s2.calculateAverageMark());
		System.out.printf("%s同学的平均成绩是：%.2f\n",s3.getName(),s3.calculateAverageMark());
	}
}

//student类的设计
class Student1
{
	private String studentNumber;
	private String studentName;
	private int markForMaths = -1;
	private int markForEnglish = -1;
	private int markForScience = -1;
	//构造方法
	public Student1(String studentNumber,String studentName) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}
	public String getNumber() {
		return studentNumber;
	}
	
	public String getName() {
		return studentName;
	}
	public void enterMarks(int markForMaths,int markForEnglish,int markForScience )
	{
		this.markForEnglish = markForEnglish;
		this.markForMaths = markForMaths;
		this.markForScience = markForScience;
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
