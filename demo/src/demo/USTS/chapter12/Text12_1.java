package demo.USTS.chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Text12_1 {

	public static void main(String[] args) {
		/*利用输入及输出流及文件类编写一个程序，实现在屏幕显示文本文件的功能。
		 * 要求显示文本的内容、文件名，路径，大小等。
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
			File fc = new File("C:\\Users\\风\\Desktop\\test\\a.txt");
			InputStreamReader read = new InputStreamReader(new FileInputStream(fc), "utf-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			while((ch = bufferedReader.readLine()) != null)
			{
				System.out.println(ch);
			}
			System.out.println("文件名："+fc.getName());
			System.out.println("绝对路径："+fc.getAbsolutePath());
			System.out.println("大小："+fc.length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
