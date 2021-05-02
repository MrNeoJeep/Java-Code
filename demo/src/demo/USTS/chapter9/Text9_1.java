package demo.USTS.chapter9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Text9_1 {

	public static void main(String[] args) {
		//创建一个Frame,有两个Button按钮和一个TextField，单击按钮，在TextField上显示Button信息
		 testButton t1 = new testButton();
		 //一定要设置为可见。否则无法显示按钮和文本框
		 t1.setVisible(true);
		 
	}
    
}

class testButton extends JFrame implements ActionListener
{
	JButton button1;
	JButton button2;
	JTextField text;
	public testButton()
	{
		super("testButton");
		this.setSize(300,300);
		this.setVisible(true);
		//设置默认关闭方式
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置顺序布局（居中对齐），间距为水平10，垂直10；
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		text = new JTextField(30);
		
		
		button1 = new JButton("按钮1");
		button2 = new JButton("按钮2");
		//做标记，方便下面的事件监听机制捕获这个标记，然后进行相应的处理
		button1.setActionCommand("button1");
		button2.setActionCommand("button2");
		//将这些全部添加到frame的框架里
		add(button1);
		add(button2);
		add(text);
		button1.addActionListener(this);
		button2.addActionListener(this);
			
		
	}
	//事件监听机制
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("button1"))
		{
			text.setText("按钮1在这里呀！");
		}else if(e.getActionCommand().equals("button2")) {
			text.setText("按钮2在这里呀！");
		}
		
		
	}
	
}
