package demo.USTS.chapter5;



public class Text5_1 {

	public static void main(String[] args) {
		/*��ͼ������student�����ƣ���д����
		 * ��дһ�����ڲ���student��Ĳ����࣬�������п��Դ�������������ѧ������ѧ��������ã�
		 * ����ʹ��student����������Ƿ�������ִ�в���
		 * */
		//����
		testStudent test1 = new testStudent();
		test1.setMarks1(98, 97, 90);
		test1.setMarks2(95, 94, 92);
		test1.setMarks3(88, 97, 93);
		test1.settings();
		test1.testCal();
		

	}

}
//����student������
class testStudent
{
	Student1 s1  = new Student1("��", "Tom");
	Student1 s2  = new Student1("��", "Kitti");
	Student1 s3  = new Student1("��", "Lili");
	
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
		System.out.printf("%sͬѧ��ƽ���ɼ��ǣ�%.2f\n",s1.getName(),s1.calculateAverageMark());
		System.out.printf("%sͬѧ��ƽ���ɼ��ǣ�%.2f\n",s2.getName(),s2.calculateAverageMark());
		System.out.printf("%sͬѧ��ƽ���ɼ��ǣ�%.2f\n",s3.getName(),s3.calculateAverageMark());
	}
}

//student������
class Student1
{
	private String studentNumber;
	private String studentName;
	private int markForMaths = -1;
	private int markForEnglish = -1;
	private int markForScience = -1;
	//���췽��
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
