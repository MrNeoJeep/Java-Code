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
		// 在JFrame中加入两个复选框，显示标题为学习和玩耍，根据选择的情况分别显示“玩耍”“学习”“劳逸结合”（两者都选）
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
		super("学习玩耍");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		play = new JRadioButtonMenuItem("玩耍");
		study = new JRadioButtonMenuItem("学习");
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
			text1.setText("玩耍！");
		}
		if(study.isSelected())
		{
			text1.setText("学习！");
		}
		if(play.isSelected() && study.isSelected())
		{
			text1.setText("劳逸结合！");
		}
	
	}
	
}