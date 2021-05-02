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
		/*��дһ��֧�������ı��༭����TextEdit.java��Ҫ������
		 * �١��û������СΪ400*200����
		 * �ڡ����������󣬶����ı������TextArea����ʾ��ǰĿ¼��myText.txt�ļ���ԭ�е�����
		 * ����ļ������ڣ����½����ļ�
		 * �ۡ������桱��ť���ܣ��������ı������TextArea�е�����д��myText.txt�ļ��б���
		 * �ܡ���ȡ������ť���ܣ��������ı������TextArea�е�������ա�
		 * �ݡ����˳�����ť���ܣ��˳�����
		 * �ޡ�����ʱ�䲻����
		 * 
		 */
		TextEdit test1 = new TextEdit();
		test1.setVisible(true);
	}

}

class TextEdit extends JFrame implements ActionListener
{
	//����һЩ���
	JButton save;
	JButton cancel;
	JButton exit;
	JTextArea text;
	
	
	//���췽��
	public TextEdit() {
		super("�ı��༭��");
		save = new JButton("����");
		cancel = new JButton("ȡ��");
		exit = new JButton("�˳�");
		
		save.addActionListener(this);
		cancel.addActionListener(this);
		exit.addActionListener(this);
		
		//�򿪼�����myText.txt�ļ�����ȡ���ļ������õ��ı���
	
		File file = new File("C:\\Users\\��\\Desktop\\test\\myText.txt");
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
		//ʵ�����ı�����
		text = new JTextArea(sbf.toString(),350,200);
		//���ý���
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
	   	//�������Ĵ�СҪ���ı���������һ���󣡣�������
	   	scrollpane.setViewportView(text);
	   
		
		this.add(scrollpane);
		//�Զ�����
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
			//����ı���
			text.setText("");
			//���뵯��
			JOptionPane.showMessageDialog(this, "���������");
		}
		if(e.getSource() == exit)
		{
			//�����˳�
			
			System.exit(0);
		}
		if(e.getSource() == save)
		{
			try {
				//�ļ���
				FileOutputStream fout = new FileOutputStream("C:\\Users\\��\\Desktop\\test\\myText.txt");
				try {
					fout.write(text.getText().getBytes());
					JOptionPane.showMessageDialog(this, "����ɹ�");
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