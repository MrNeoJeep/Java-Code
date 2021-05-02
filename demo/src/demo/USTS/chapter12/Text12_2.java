package demo.USTS.chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Text12_2 {

	public static void main(String[] args) {
		/*设计一个通讯录，保存用户信息。通讯录中除了包括基本信息外，还要实现简单的检索功能。
		 * 通讯录写入文件，程序执行时需要从文件中导入数据，程序退出后再将数据保存到文件中。第一次执行时新创建一个文件。
		 * 
		 */
		realizeBook testBook = new realizeBook();
		testBook.test();
		addressBook person = testBook.findByName("Tim",testBook.addrBooks);
		System.out.println("name = "+person.getM_name());
		System.out.println("number = "+person.getM_number());
		System.out.println("addr = "+person.getM_address());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		addressBook person1 = testBook.findByNum("15861563443",testBook.addrBooks);
		System.out.println("name = "+person1.getM_name());
		System.out.println("number = "+person1.getM_number());
		System.out.println("addr = "+person1.getM_address());
		
		
	}

}
//测试类
class realizeBook
{
	List<addressBook> addrBooks = new ArrayList<addressBook>();
	public void test() 
	{
		addressBook person1 = new addressBook("TOM", "13761536843", "北京");
		addressBook person2 = new addressBook("Tim", "18761567843", "上海");
		addressBook person3 = new addressBook("kitti", "13961567843", "广州");
		addressBook person4 = new addressBook("Mili", "15861563443", "深圳");
		//数组保存联系人的信息
		
		addrBooks.add(person1);
		addrBooks.add(person2);
		addrBooks.add(person3);
		addrBooks.add(person4);
		
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\风\\Desktop\\test\\result.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(person1);
			os.writeObject(person2);
			os.writeObject(person3);
			os.writeObject(person4);
			
			os.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//读入数据
		FileInputStream fis = null;
		person1 = null;
		person2 = null;
		person3 = null;
		person4 = null;
	
		try {
			try {
				fis = new FileInputStream("C:\\Users\\风\\Desktop\\test\\result.txt");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			ObjectInputStream oS = new ObjectInputStream(fis);
			person1 = (addressBook)oS.readObject();
			person2 = (addressBook)oS.readObject();
			person3 = (addressBook)oS.readObject();
			person4 = (addressBook)oS.readObject();
			oS.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			System.exit(-2);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("name = "+person1.getM_name());
		System.out.println("number = "+person1.getM_number());
		System.out.println("addr = "+person1.getM_address());
		
		System.out.println("name = "+person2.getM_name());
		System.out.println("number = "+person2.getM_number());
		System.out.println("addr = "+person2.getM_address());
		
		System.out.println("name = "+person3.getM_name());
		System.out.println("number = "+person3.getM_number());
		System.out.println("addr = "+person3.getM_address());
		
		System.out.println("name = "+person4.getM_name());
		System.out.println("number = "+person4.getM_number());
		System.out.println("addr = "+person4.getM_address());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
	public addressBook findByNum(String number,List<addressBook> addressBooks)
	{
		for(int i = 0; i < addressBooks.size();i++)
		{
			if(addressBooks.get(i).getM_number().equals(number))
			{
				return addressBooks.get(i);
			}
		
		}
		return null;
	}
	public addressBook findByName(String name,List<addressBook> addrBooks2)
	{
		for(int i = 0; i < addrBooks2.size();i++)
		{
			if(addrBooks2.get(i).getM_name().equals(name))
			{
				return addrBooks2.get(i);//return 也是结束语句
			}
		}
		return null;
	}
}
//通讯录类
class addressBook implements Serializable
{
	private String m_name;
	private String m_number;
	private String m_address;
	public addressBook(String name,String number,String address) {
		this.m_name = name;
		this.m_number = number;
		this.m_address = address;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_number() {
		return m_number;
	}
	public void setM_number(String m_number) {
		this.m_number = m_number;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	
}

