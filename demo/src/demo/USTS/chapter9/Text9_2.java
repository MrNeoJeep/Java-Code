package demo.USTS.chapter9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class Text9_2 {

	public static void main(String[] args) {
		/*做一个简易的“加减乘除”计算器。JFrame中加入一个显示结果的标签，两个输入文本框
		 * 4个单选框（标题分别为+、-、*、/），一个按钮。分别输入两个整数，选择相应的运算符，单击后显示运算结果。
		 * 
		 */
		Compute compute = new Compute();
		compute.setVisible(true);
	}

}

class Compute extends JFrame implements ActionListener
{
	JLabel result;
	JTextField input1;
	JTextField input2;
	JButton button;
	JRadioButtonMenuItem plus;
	JRadioButtonMenuItem subtract;
	JRadioButtonMenuItem multiply;
	JRadioButtonMenuItem division;
	
	public Compute() {
		super("极简计算器");
		input1 = new JTextField(10);
		input2 = new JTextField(10);
		button = new JButton("=");
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		//自定义布局
//		input1.setBounds(100,150,75,75);
//		input2.setBounds(300,150,75,75);
//		button.setBounds(50,300,75,50);
		this.add(input1);
		
		plus = new JRadioButtonMenuItem("+");
		subtract = new JRadioButtonMenuItem("-");
		multiply = new JRadioButtonMenuItem("*");
		division = new JRadioButtonMenuItem("/");
		
		ButtonGroup signGroup = new ButtonGroup();
		signGroup.add(plus);
		signGroup.add(subtract);
		signGroup.add(multiply);
		signGroup.add(division);
		
		JPanel jp = new JPanel();
		jp.add(plus);
		jp.add(subtract);
		jp.add(multiply);
		jp.add(division);
		getContentPane().add(jp);
		plus.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		division.addActionListener(this);
		
		
		button.setActionCommand("getres");
		this.add(input2);
		this.add(button);
		button.addActionListener(this);
		input1.addActionListener(this);
		input2.addActionListener(this);
	
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e ){
		String Text1 = input1.getText();
		String Text2 = input2.getText();
		try {
			int num1 = Integer.parseInt(Text1);
			int num2 = Integer.parseInt(Text2);
			//如果加法被选择的话
			if(plus.isSelected())
			{
				int res = num1 + num2;
				//整型转字符串
				//方法1
				String reString = String.valueOf(res);
				//方法2
				//String reString = Integer.toString(res);
				//方法3 自动类型转换
				//String reString  = ""+res;
				result = new JLabel(reString);
				
			}
			//如果减法被选择的话
			if(subtract.isSelected())
			{
				int res = num1 - num2;
				//整型转字符串
				//方法1
				String reString = String.valueOf(res);
				//方法2
				//String reString = Integer.toString(res);
				//方法3 自动类型转换
				//String reString  = ""+res;
				result = new JLabel(reString);
			}
			//如果乘法被选择的话
			if(multiply.isSelected())
			{
				int res = num1 * num2;
				//整型转字符串
				//方法1
				String reString = String.valueOf(res);
				//方法2
				//String reString = Integer.toString(res);
				//方法3 自动类型转换
				//String reString  = ""+res;
				result = new JLabel(reString);
			}
			//如果除法被选择的话
			if(division.isSelected())
			{
				double res = (double)num1 / num2;
				
				//整型转字符串
				//方法1
				String reString = String.valueOf(res);
				//方法2
				//String reString = Integer.toString(res);
				//方法3 自动类型转换
				//String reString  = ""+res;
				result = new JLabel(reString);
			}
			
			
			if(e.getActionCommand().equals("getres"))
			{
				this.add(result);
				result.setBounds(225, 100, 50, 50);
			}
		
			
		} catch(Exception e3) {
			System.out.println("你的输入或输入顺序错误");
		}
	}
	
}