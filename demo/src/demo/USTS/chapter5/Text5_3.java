package demo.USTS.chapter5;
public class Text5_3 {

	public static void main(String[] args) {
		/*��дһ��studentList�������洢��ϰ��1����������student����
		 * �����UMLͼ������StudentList�����student����Ĺ�ϵ��
		 * */
		StudentList list1 = new StudentList(4);
		student stu1  = new student("��", "Tom",30,20,30);
		student stu2  = new student("��", "Kitti",89,88,49);
		student stu3  = new student("��", "Lili",89,76,77);
		list1.add(stu1);
		list1.add(stu2);
		list1.add(stu3);
		System.out.println("����Ϊ��"+list1.getTotal()); 
		list1.getItem("��");
		list1.getItem("��");
		list1.getItem("��");
		

	}

}
//ѧ���б�
class StudentList 
{
	student[] list;
	int total = 0;
	
	StudentList(int length)
	{
		list = new student[length];//����
	}
	
	//�ж������Ƿ�Ϊ��
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
	//�ж������Ƿ���
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
	//��Ӻ���
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
	//�Ƴ�����
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
					System.out.println("Ӣ��ɼ���"+list[i].markForEnglish);
					System.out.println("��ѧ�ɼ���"+list[i].markForMaths);
					System.out.println("��ѧ�ɼ���"+list[i].markForScience);
					return;
				}
			}
			
		}
		else {
			System.out.println("��");
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
	//���췽��
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
