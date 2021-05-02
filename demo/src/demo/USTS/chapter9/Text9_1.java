package demo.USTS.chapter9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Text9_1 {

	public static void main(String[] args) {
		//����һ��Frame,������Button��ť��һ��TextField��������ť����TextField����ʾButton��Ϣ
		 testButton t1 = new testButton();
		 //һ��Ҫ����Ϊ�ɼ��������޷���ʾ��ť���ı���
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
		//����Ĭ�Ϲرշ�ʽ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����˳�򲼾֣����ж��룩�����Ϊˮƽ10����ֱ10��
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		text = new JTextField(30);
		
		
		button1 = new JButton("��ť1");
		button2 = new JButton("��ť2");
		//����ǣ�����������¼��������Ʋ��������ǣ�Ȼ�������Ӧ�Ĵ���
		button1.setActionCommand("button1");
		button2.setActionCommand("button2");
		//����Щȫ����ӵ�frame�Ŀ����
		add(button1);
		add(button2);
		add(text);
		button1.addActionListener(this);
		button2.addActionListener(this);
			
		
	}
	//�¼���������
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("button1"))
		{
			text.setText("��ť1������ѽ��");
		}else if(e.getActionCommand().equals("button2")) {
			text.setText("��ť2������ѽ��");
		}
		
		
	}
	
}
