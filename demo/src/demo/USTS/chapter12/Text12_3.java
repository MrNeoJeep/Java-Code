package demo.USTS.chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Text12_3 {

	public static void main(String[] args) {
		/*理解字节流和字符流的概念。已有.txt文件，文件中有中文字符。
		 * 使用FileInputStream和FileReader分别读取文件，并把内容显示在控制台，
		 * 比较两者的读取效率。
		 */
		long time1_stream = stream1();
		System.out.println("\n~~~~~~~~~~~~~~~~~~");
		long time2_buffer = buffer();
		System.out.println("字节流耗费时间："+time1_stream+"ms");
		System.out.println("字符流耗费时间："+time2_buffer+"ms");

	}
	public static long stream1()
	{
		long stime = System.currentTimeMillis();
		FileInputStream fin;
		FileOutputStream fout;
		try {
			
			int ch;
			fin = new FileInputStream("C:\\Users\\风\\Desktop\\test\\a.txt");
			fout = new FileOutputStream(FileDescriptor.out);
			while((ch = fin.read()) != -1)
			{
				fout.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long etime = System.currentTimeMillis();
		return (etime-stime);
	}
	public static long buffer()
	{

        long stime = System.currentTimeMillis();

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
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

        long etime = System.currentTimeMillis();
        return (etime-stime);
	}

}

