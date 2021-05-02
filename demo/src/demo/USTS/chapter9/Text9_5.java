package demo.USTS.chapter9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Text9_5 {

	public static void main(String[] args) {
		// 编写一个可以接收字符输入的GUI程序，接收用户输入的10个整数，并输出这是个整数的最大值和最小值
		AnalysisNum test1 = new AnalysisNum();
		test1.setVisible(true);
	}

}

class AnalysisNum extends JFrame implements ActionListener
{
	JLabel text;
	JLabel in;
	JLabel out;
	JLabel maxJLabel;
	JLabel minJLabel;
	JButton cal;
	JTextField inArea;
	JTextField maxNum;
	JTextField minNum;
	
	
	public AnalysisNum() {
		super("输出最值");
		in = new JLabel("输入");
		out = new JLabel("输出");
		cal = new JButton("计算");
		text = new JLabel("请输入10个整数，用逗号分隔，程序将输出最大值和最小值");
	    inArea = new JTextField(20); 
	    maxNum = new JTextField(10);
	    minNum = new JTextField(10);
	    maxJLabel = new JLabel("最大值");
	    minJLabel = new JLabel("最小值");
	    
	    //给计算按钮添加事件监听
	    cal.addActionListener(this);
	    //对界面的设置
	    this.setSize(650,200);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
	    //添加各个组件到框架中
	    this.add(text);
	    this.add(in);
	    this.add(inArea);
	    this.add(cal);
	    this.add(out);
	    this.add(maxJLabel);
	    this.add(maxNum);
	    this.add(minJLabel);
	    this.add(minNum);
	    
	    
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cal)
		{
			String string = inArea.getText();
			String []arr = string.split(",");
			int []arrInt = new int[arr.length];
			for(int i = 0; i < arr.length;i++)
			{
				arrInt[i] = Integer.parseInt(arr[i]);
			}
			
			//写一个简单的方法得到最大值和最小值
			int maxNum1 = arrInt[0];
			int minNum1 = arrInt[0];
			
			for(int i = 0;i < arr.length;i++)
			{
				if(arrInt[i] >= maxNum1)
				{
					maxNum1 = arrInt[i];
				}
				if(arrInt[i] <= minNum1)
				{
					minNum1 = arrInt[i];
				}
			}
			String temp1 = "" + maxNum1;
			String temp2 = "" + minNum1;
			maxNum.setText(temp1);
			minNum.setText(temp2);
		}
		
	}
	
}