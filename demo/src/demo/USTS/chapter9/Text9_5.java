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
		// ��дһ�����Խ����ַ������GUI���򣬽����û������10����������������Ǹ����������ֵ����Сֵ
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
		super("�����ֵ");
		in = new JLabel("����");
		out = new JLabel("���");
		cal = new JButton("����");
		text = new JLabel("������10���������ö��ŷָ�������������ֵ����Сֵ");
	    inArea = new JTextField(20); 
	    maxNum = new JTextField(10);
	    minNum = new JTextField(10);
	    maxJLabel = new JLabel("���ֵ");
	    minJLabel = new JLabel("��Сֵ");
	    
	    //�����㰴ť����¼�����
	    cal.addActionListener(this);
	    //�Խ��������
	    this.setSize(650,200);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
	    //��Ӹ�������������
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
			
			//дһ���򵥵ķ����õ����ֵ����Сֵ
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