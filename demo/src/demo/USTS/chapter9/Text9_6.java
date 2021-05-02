package demo.USTS.chapter9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Text9_6 {

	public static void main(String[] args) {
		/*编写一个支持中文文本编辑程序TextEdit.java，要求如下
		 * ①、用户界面大小为400*200像素
		 * ②、程序启动后，多行文本输入框TextArea中显示当前目录下myText.txt文件中原有的内容
		 * 如果文件不存在，则新建该文件
		 * ③、“保存”按钮功能：将多行文本输入框TextArea中的内容写入myText.txt文件中保存
		 * ④、“取消”按钮功能；将多行文本输入框TextArea中的内容清空。
		 * ⑤、“退出”按钮功能：退出程序
		 * ⑥、窗口时间不处理
		 * 
		 */
		TextEdit test1 = new TextEdit();
		test1.setVisible(true);
	}

}

class TextEdit extends JFrame implements ActionListener
{
	//定义一些组件
	JButton save;
	JButton cancel;
	JButton exit;
	JTextArea text;
	
	
	//构造方法
	public TextEdit() {
		super("文本编辑器");
		save = new JButton("保存");
		cancel = new JButton("取消");
		exit = new JButton("退出");
		
		save.addActionListener(this);
		cancel.addActionListener(this);
		exit.addActionListener(this);
		
		//打开即加载myText.txt文件，读取该文件，设置到文本区
	
		File file = new File("C:\\Users\\风\\Desktop\\test\\myText.txt");
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		BufferedReader reader = null;
	    StringBuffer sbf = new StringBuffer();
		try {
			reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
		}
		//实例化文本区域
		text = new JTextArea(sbf.toString(),350,200);
		//设置界面
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		save.setBounds(110,120,60,30);
		cancel.setBounds(180,120,60,30);
		exit.setBounds(250,120,60,30);
		text.setBounds(0, 0, 400, 100);
		this.add(text);
		JScrollPane scrollpane = new JScrollPane(text);
	   	scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	   	scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	   	scrollpane.setBounds(0, 0, 400, 100);
	   	//滚动条的大小要与文本输入区域一样大！！！！！
	   	scrollpane.setViewportView(text);
	   
		
		this.add(scrollpane);
		//自动换行
	   	text.setLineWrap(true);
	   	validate();
		
		
		this.add(save);
		this.add(cancel);
		this.add(exit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cancel)
		{
			//清空文本区
			text.setText("");
			//加入弹窗
			JOptionPane.showMessageDialog(this, "已清空区域");
		}
		if(e.getSource() == exit)
		{
			//设置退出
			
			System.exit(0);
		}
		if(e.getSource() == save)
		{
			try {
				//文件流
				FileOutputStream fout = new FileOutputStream("C:\\Users\\风\\Desktop\\test\\myText.txt");
				try {
					fout.write(text.getText().getBytes());
					JOptionPane.showMessageDialog(this, "保存成功");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	
	
}