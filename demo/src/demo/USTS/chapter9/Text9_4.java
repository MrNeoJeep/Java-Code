package demo.USTS.chapter9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class Text9_4 {

	public static void main(String[] args) {
		// ��JFrame�м���������ѡ����ʾ����Ϊѧϰ����ˣ������ѡ�������ֱ���ʾ����ˣ����ѧϰ�������ݽ�ϡ������߶�ѡ��
		life l1 = new life();
		l1.setVisible(true);
	}

}

class life extends JFrame implements ActionListener
{
	JTextField text1;
	JRadioButtonMenuItem play;
	JRadioButtonMenuItem study;
	public life() {
		super("ѧϰ��ˣ");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		play = new JRadioButtonMenuItem("��ˣ");
		study = new JRadioButtonMenuItem("ѧϰ");
		JPanel jp = new JPanel();
		jp.add(play);
		jp.add(study);
		getContentPane().add(jp);
		play.addActionListener(this);
		study.addActionListener(this);
		text1 = new JTextField(10);
		this.add(text1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(play.isSelected())
		{
			text1.setText("��ˣ��");
		}
		if(study.isSelected())
		{
			text1.setText("ѧϰ��");
		}
		if(play.isSelected() && study.isSelected())
		{
			text1.setText("���ݽ�ϣ�");
		}
	
	}
	
}