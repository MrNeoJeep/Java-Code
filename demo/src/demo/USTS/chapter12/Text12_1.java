package demo.USTS.chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Text12_1 {

	public static void main(String[] args) {
		/*�������뼰��������ļ����дһ������ʵ������Ļ��ʾ�ı��ļ��Ĺ��ܡ�
		 * Ҫ����ʾ�ı������ݡ��ļ�����·������С�ȡ�
		 */
		FileRead f1 = new FileRead();
		f1.getData();
	}

}

class FileRead
{
	public void getData()
	{
		try {
			String ch = null;
			//String encoding = "utf-8"; 
			File fc = new File("C:\\Users\\��\\Desktop\\test\\a.txt");
			InputStreamReader read = new InputStreamReader(new FileInputStream(fc), "utf-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			while((ch = bufferedReader.readLine()) != null)
			{
				System.out.println(ch);
			}
			System.out.println("�ļ�����"+fc.getName());
			System.out.println("����·����"+fc.getAbsolutePath());
			System.out.println("��С��"+fc.length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
